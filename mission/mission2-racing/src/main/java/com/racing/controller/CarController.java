package com.racing.controller;

import com.racing.domain.Car;
import com.racing.view.InputView;

import java.util.Random;

public class CarController {

    private final InputView inputView;
    private final Car car;

    public CarController(final InputView inputView, final Car car){
        this.inputView = inputView;
        this.car = car;
    }

    public void startCarMove(){
        int randomNumber = car.generateRandom();
        int checkNumber = car.checkMove(randomNumber);
        car.car_move(checkNumber);
        String carName = inputView.input();
        car.setCarName(carName);
    }
}
