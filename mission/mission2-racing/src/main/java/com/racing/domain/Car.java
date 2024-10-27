package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Car {

    private static final String MOVING_POINT = "-";

    public String showCarName(String carName) {
        return carName;
    }

    public List<String> showCar(String carName) {
        List<String> car = new ArrayList<>();
        car.add(carName);
        return car;
    }

    public List<String> forwardOrStop(List<String> car) {
        return moveCar(car, getRandomNumber());
    }

    private List<String> moveCar(List<String> states, int randomNumber) {
        if (randomNumber >= 4) {
            states.add(MOVING_POINT);
            return states;
        }
        return states;
    }

    private int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
