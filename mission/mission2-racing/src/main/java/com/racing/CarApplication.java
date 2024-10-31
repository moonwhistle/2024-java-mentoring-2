package com.racing;

import com.racing.controller.RacingController;
import com.racing.domain.RandomNumbers;
import com.racing.service.CarsService;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RandomNumbers randomNumbers = new RandomNumbers();

        CarsService carsService = new CarsService(null);

        RacingController racingController = new RacingController(inputView, outputView, randomNumbers, carsService);

        racingController.startCarsMove();
    }

}
