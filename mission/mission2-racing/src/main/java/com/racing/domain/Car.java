package com.racing.domain;

public class Car {

    private int carPosition;
    private final CarName carName;

    public Car(final CarName carName) {
        this.carName = carName;
    }

    public int getCarPosition() {
        return carPosition;
    }

    public CarName getCarName() {
        return carName;
    }
}
