package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Car {

    private static final String MOVING_POINT = "-";

    public List<String> saveCar(String carName) {
        List<String> car = new ArrayList<>();
        car.add(carName);
        return car;
    }

    public int receiveNumber() {
        return getRandomNumber();
    }

    public List<String> forwardOrStop(List<String> carInformation, int randomNumber) {
        if (randomNumber >= 4) {
            carInformation.add(MOVING_POINT);
            return carInformation;
        }
        return carInformation;
    }

    private int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
