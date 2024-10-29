package com.racing.domain;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private static final String MOVING_POINT = "-";
    private static final int DECISION_POINT = 4;
    private static final int MAX_BOUND = 9;

    private final RandomNumber randomNumber;

    public Car(RandomNumber randomNumber) {
        this.randomNumber = randomNumber;
    }

    public List<String> saveCar(String carName) {
        List<String> car = new ArrayList<>();
        car.add(carName);
        return car;
    }

    public List<String> forwardOrStop(List<String> carInformation) {
        if (randomNumber.generateRandomNumber(MAX_BOUND) >= DECISION_POINT) {
            carInformation.add(MOVING_POINT);
        }
        return carInformation;
    }
}
