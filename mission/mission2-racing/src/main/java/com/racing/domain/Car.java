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

    private int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
