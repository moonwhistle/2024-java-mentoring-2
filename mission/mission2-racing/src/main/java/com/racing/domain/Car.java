package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Car {

    private static final String MOVING_POINT = "-";
    private static final int DECISION_POINT = 4;

    public List<String> saveCar(String carName) {
        List<String> car = new ArrayList<>();
        car.add(carName);
        return car;
    }

    public int receiveNumber() {
        return generateRandomNumber();
    }

    public List<String> forwardOrStop(List<String> carInformation, int randomNumber) {
        if (randomNumber >= DECISION_POINT) {
            carInformation.add(MOVING_POINT);
        }
        return carInformation;
    }

    private int generateRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
