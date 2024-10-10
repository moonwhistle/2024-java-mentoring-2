package com.racing;

import com.racing.controller.CarController;
import com.racing.domain.Car;
import com.racing.view.InputView;

public class CarApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        CarController carController = new CarController(inputView);
        carController.startCarMove();
    }
}