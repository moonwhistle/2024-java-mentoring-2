package com.racing.domain;

import java.util.Random;

public class Car {

    public String showCarName(String carName) {
        return carName;
    }

    private int getRandomNumber() {
        Random randomNumber = new Random();
        return randomNumber.nextInt(9);
    }
}
