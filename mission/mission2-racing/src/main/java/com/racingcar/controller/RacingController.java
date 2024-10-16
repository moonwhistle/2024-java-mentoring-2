package com.racingcar.controller;

import com.racingcar.domain.Racing;
import com.racingcar.view.InputView;
import com.racingcar.view.OutputView;

public class RacingController {

    private final InputView inputview;
    private final OutputView outputview;
    private final Racing racing;

    public RacingController(InputView inputview, OutputView outputview, Racing racing) {
        this.inputview = inputview;
        this.outputview = outputview;
        this.racing = racing;
    }

    public void run() {
        inputview.carName();

        int randomNumber = racing.randomValue();
        int road = racing.count(randomNumber);

        outputview.result(road);
    }

}
