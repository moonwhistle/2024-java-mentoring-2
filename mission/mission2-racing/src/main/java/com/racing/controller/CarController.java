package com.racing.controller;

import com.racing.domain.Car;
import com.racing.view.InputView;

import java.util.Random;

public class CarController {

    private final InputView inputView;

    public CarController(InputView inputView){
        this.inputView = inputView;
    }

    public void startCarMove(){
        final Car car = new Car(inputView.input(),0, new Random());
        car.car_move();
    }
}
