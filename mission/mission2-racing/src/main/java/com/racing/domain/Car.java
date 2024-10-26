package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Car {

    private static final String MOVING_POINT = "-";

    public String showCarName(String carName) {
        return carName;
    }

    public List<String> forwardOrStop(String carName) {
        List<String> states = new ArrayList<>();
        return moveCar(states, carName);
    }

    private List<String> moveCar(List<String> states, String carName) {
        states.add(carName);
        if (getRandomNumber() >= 4) {
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
