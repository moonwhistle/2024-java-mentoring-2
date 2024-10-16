package com.racingcar;

import com.racingcar.controller.RacingController;
import com.racingcar.domain.Racing;
import com.racingcar.view.InputView;
import com.racingcar.view.OutputView;

public class RacingApplication {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Racing racing = new Racing();

        RacingController racingController = new RacingController(inputView, outputView, racing);
        racingController.run();
    }

}
