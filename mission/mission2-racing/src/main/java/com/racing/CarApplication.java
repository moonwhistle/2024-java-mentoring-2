package com.racing;

import com.racing.controller.CarController;
import com.racing.domain.car.Racing;
import com.racing.domain.car.Registration;
import com.racing.domain.number.RandomNumberGenerator;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarApplication {

    public static void main(String[] args) {
        CarController carController = new CarController(new Racing(), new Registration(), new RandomNumberGenerator(), new OutputView(), new InputView());
        carController.run();
    }
}
