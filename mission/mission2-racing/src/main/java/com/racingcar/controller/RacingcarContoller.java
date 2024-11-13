package com.racingcar.controller;

import com.racingcar.domain.*;

import com.racingcar.view.*;

import java.util.List;

public class RacingcarContoller {

    private final InputView inputView;
    private final Outputview outputview;
    private final RacingCarLogic racingCarLogic;

    public RacingcarContoller(){
        this.inputView = new InputView();
        this.outputview = new Outputview();
        this.racingCarLogic = new RacingCarLogic();
    }

    public void runCar(){

        outputview.showCarNameInputPrompt();
        String carName = inputView.getInput();

        outputview.showTryCountInputPrompt();
        String strTryCount = inputView.getInput();
        int tryCount = racingCarLogic.parseTryCount(strTryCount);

        Cars cars = new Cars(carName);
        cars = racingCarLogic.loopTryCount(tryCount, cars);
        List<String> winnerList = cars.getWinner();

        String winner = racingCarLogic.buildWinnerString(winnerList);
        outputview.showWinner(winner);
    }
}
