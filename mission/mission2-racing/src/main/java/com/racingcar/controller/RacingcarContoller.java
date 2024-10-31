package com.racingcar.controller;

import com.racingcar.domain.RacingCarLogic;
import com.racingcar.view.InputView;
import com.racingcar.view.Outputview;

public class RacingcarContoller {

    private final InputView inputView;
    private final Outputview outputview;

    public RacingcarContoller(){
        this.inputView = new InputView();
        this.outputview = new Outputview();
    }

    public void runCar(){

        outputview.printValue("경주할 자동차 이름을 입력하세요.");
        String carName = inputView.getInput();

        RacingCarLogic racingCarLogic = new RacingCarLogic();

        int isCarMoved = racingCarLogic.processCarMove();

        outputview.printValue(carName + " : " + isCarMoved);
    }
}
