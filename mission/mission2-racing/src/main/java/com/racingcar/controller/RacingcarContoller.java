package com.racingcar.controller;

import com.racingcar.controller.dto.RequestDTO;
import com.racingcar.controller.dto.CarDataDTO;
import com.racingcar.controller.dto.ResponseDTO;

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

    public RequestDTO wrapInputViewRequest() {
        outputview.showCarNameInputPrompt();
        String strCarNames = inputView.getInput();

        outputview.showTryCountInputPrompt();
        String strTryCount = inputView.getInput();

        return new RequestDTO(strCarNames, strTryCount);
    }

    public void runCar(){

        RequestDTO inputViewRequestDTO = wrapInputViewRequest();

//        RequestDTO inputViewDTO = new RequestDTO(strCarNames, strTryCount);
//
//        String[] carArray = racingCarLogic.splitCarName(strCarNames);
//        ArrayList<String> carNames = racingCarLogic.arrayToArrayList(carArray);
//
//        int tryCount = integerParser.parseInteger(strTryCount);
//
//        RequestDTO requestDTO = new RequestDTO(carNames, tryCount);
//
//        Cars cars = new Cars(carNames);
//
//        cars = racingCarLogic.loopTryCount(tryCount, cars);
//        List<String> winnerList = cars.getWinner();
//
//        String winner = racingCarLogic.buildWinnerString(winnerList);
//        outputview.showWinner(winner);
    }
}
