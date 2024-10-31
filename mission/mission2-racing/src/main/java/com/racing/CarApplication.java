package com.racing;

import com.racing.controller.CarController;
import com.racing.domain.car.MovingCar;
import com.racing.domain.number.RandomNumberGenerator;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarApplication {

    public static void main(String[] args) {
        CarController carController = new CarController(new RandomNumberGenerator(), new OutputView(), new InputView(), new MovingCar());
        carController.moveCar();
    }
}
