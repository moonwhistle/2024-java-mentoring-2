package com.racingcar.controller;

import com.racingcar.domain.RacingCarLogic;

import com.racingcar.view.InputView;
import com.racingcar.view.Outputview;

import com.racingcar.domain.RandomNumberGenerator;
import com.racingcar.domain.ZeroToNineGenerator;

public class RacingcarContoller {

    private final InputView inputView;
    private final Outputview outputview;
    private final RacingCarLogic racingCarLogic;
    private final RandomNumberGenerator zeroToNineGenerator;

    public RacingcarContoller(){
        this.inputView = new InputView();
        this.outputview = new Outputview();
        this.racingCarLogic = new RacingCarLogic();
        this.zeroToNineGenerator = new ZeroToNineGenerator();
    }

    public void runCar(){

        outputview.showCarNameInputPrompt();
        String carName = inputView.getInput();

        int randomNumber = zeroToNineGenerator.getRandomNumber();

        int moveState = racingCarLogic.getCarMoveState(randomNumber);
        String isCarMoved = racingCarLogic.isCarMoved(moveState);

        outputview.showCarMove(carName, isCarMoved);
    }
}
