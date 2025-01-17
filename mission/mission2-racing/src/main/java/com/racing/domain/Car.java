package com.racing.domain;

public class Car {

    private int carPosition;
    private final String carName;

    public Car(final String carName) {
        this.carName = carName;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public String getCarName() {
        return carName;
    }
}
