package com.racing.controller;

import com.racing.domain.Car;
import com.racing.domain.RandomNumber;
import com.racing.view.InputView;

import java.util.Random;

public class CarController {

    private final InputView inputView;

    public CarController(final InputView inputView){
        this.inputView = inputView;
    }

    public void startCarMove(){
        final Car car = new Car(inputView.input());
        int random = car.generateRandomNumber();
        int move = car.checkMove(random);
        car.carMove(move);
        car.getPosition();
    }
}
