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

        outputview.printValue("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String carName = inputView.getInputValue();

        outputview.printValue("시도할 회수는 몇회인가요?");
        String tryCount = inputView.getInputValue();

        RacingCarLogic racingCarLogic = new RacingCarLogic();

        int integerTrycount = racingCarLogic.parseStringTryCount(tryCount);

        String carMoveResult = racingCarLogic.processMoving(carName, integerTrycount);

        outputview.printValue("실행 결과");
        outputview.printValue(carMoveResult);
    }
}
