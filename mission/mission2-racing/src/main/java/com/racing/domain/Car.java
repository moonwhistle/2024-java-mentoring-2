package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Car {

    private static final String MOVING_POINT = "-";

    public String showCarName(String carName) {
        return carName;
    }

    public List<String> showCarState(String carName, String state) {
        return carState(carName, state);
    }

    public List<String> forwardOrStop(List<String> carState) {
        if (getRandomNumber() >= 4) {
            carState.add(MOVING_POINT);
            return carState;
        }
        return carState;
    }

    private List<String> carState(String carName, String movingPoint) {
        List<String> states = new ArrayList<>();
        states.add(carName);
        states.add(MOVING_POINT);
        return states;
    }

    private int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
