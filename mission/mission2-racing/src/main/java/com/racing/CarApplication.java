package com.racing;

import com.racing.controller.RacingController;
import com.racing.domain.Cars;
import com.racing.domain.RandomNumbers;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomNumbers randomNumbers = new RandomNumbers();

        RacingController racingController = new RacingController(inputView, outputView, randomNumbers);
        racingController.startCarsMove();
    }

}
