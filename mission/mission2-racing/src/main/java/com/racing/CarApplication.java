package com.racing;

import com.racing.controller.CarController;
import com.racing.domain.ImplementRandomNumber;
import com.racing.domain.GenerateRandom;
import com.racing.view.InputView;

public class CarApplication {

    public static void main(String[] args) {
        InputView inputView = new InputView();
        GenerateRandom generateRandom = new ImplementRandomNumber();
        CarController carController = new CarController(inputView, generateRandom);
        carController.startCarMove();
    }
}