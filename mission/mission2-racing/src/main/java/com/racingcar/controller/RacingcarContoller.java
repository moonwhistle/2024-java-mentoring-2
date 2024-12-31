package com.racingcar.controller;

import com.racingcar.domain.Cars;
import com.racingcar.domain.IntegerParser;
import com.racingcar.domain.RacingCarLogic;

import com.racingcar.view.InputView;
import com.racingcar.view.Outputview;

import java.util.ArrayList;
import java.util.List;

public class RacingcarContoller {

    private final InputView inputView;
    private final Outputview outputview;
    private final RacingCarLogic racingCarLogic;
    private final IntegerParser integerParser;

    public RacingcarContoller(){
        this.inputView = new InputView();
        this.outputview = new Outputview();
        this.racingCarLogic = new RacingCarLogic();
        this.integerParser = new IntegerParser();
    }

    public void runCar(){

        outputview.showCarNameInputPrompt();
        String carName = inputView.getInput();

        outputview.showTryCountInputPrompt();
        String strTryCount = inputView.getInput();
        int tryCount = integerParser.parseInteger(strTryCount);

        String[] carArray = racingCarLogic.splitCarName(carName);
        ArrayList<String> carnames = racingCarLogic.arrayToArrayList(carArray);
        Cars cars = new Cars(carnames);
        
        cars = racingCarLogic.loopTryCount(tryCount, cars);
        List<String> winnerList = cars.getWinner();

        String winner = racingCarLogic.buildWinnerString(winnerList);
        outputview.showWinner(winner);
    }
}
