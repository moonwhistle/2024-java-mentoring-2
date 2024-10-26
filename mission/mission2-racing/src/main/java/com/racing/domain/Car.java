package com.racing.domain;

import java.util.Random;

public class Car {

    private static final String INITIAL_STATE = "-";

    public String showCarName(String carName) {
        return carName;
    }

    public String showInitialMoving() {
        return INITIAL_STATE;
    }

    public String[] showCarState(String carName, String state) {
        return carState(carName, state);
    }

    private static String[] carState(String carName, String state) {
        String[] states = new String[2];
        states[0] = carName;
        states[1] = INITIAL_STATE;
        return states;
    }

    private int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
