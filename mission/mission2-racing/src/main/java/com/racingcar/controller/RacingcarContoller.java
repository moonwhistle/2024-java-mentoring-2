package com.racingcar.controller;

import com.racingcar.domain.RacingCarLogic;
import com.racingcar.view.CarNameInputView;
import com.racingcar.view.Outputview;
import com.racingcar.view.TryCountInputView;

public class RacingcarContoller {

    private final CarNameInputView carNameInputView;
    private final TryCountInputView tryCountInputView;
    private final Outputview outputview;

    public RacingcarContoller(){

        this.carNameInputView = new CarNameInputView();
        this.tryCountInputView = new TryCountInputView();

        this.outputview = new Outputview();
    }

    public void runCar(){

        String carName = carNameInputView.getCarNameInput();
        String tryCount = tryCountInputView.getTryCountInput();

        RacingCarLogic racingCarLogic = new RacingCarLogic();

        int integerTrycount = racingCarLogic.parseStringTryCount(tryCount);

        String carMoveResult = racingCarLogic.processMoving(carName, integerTrycount);

        outputview.printValue(carMoveResult);
    }
}
