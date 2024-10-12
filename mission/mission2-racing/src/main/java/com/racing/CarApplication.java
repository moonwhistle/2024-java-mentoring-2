package com.racing;

import com.racing.controller.CarController;
import com.racing.domain.RandomNumbers;
import com.racing.domain.GenerateRandom;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CarController carController = new CarController(inputView, outputView, new RandomNumbers());
        carController.startCarMove();
    }
}
