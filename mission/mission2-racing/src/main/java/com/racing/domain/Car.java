package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class Car {

    private static final String INITIAL_STATE = "-";

    public String showCarName(String carName) {
        return carName;
    }

    public String showInitialMoving() {
        return INITIAL_STATE;
    }

    public List<String> showCarState(String carName, String state) {
        return carState(carName, state);
    }

    private List<String> carState(String carName, String state) {
        List<String> states = new ArrayList<>();
        states.add(carName);
        states.add(state);
        return states;
    }

    private int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
