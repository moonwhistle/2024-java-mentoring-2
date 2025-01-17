package com.racing.domain;

public class Car {

    private CarPosition carPosition;
    private final CarName carName;

    public Car(final CarName carName) {
        this.carName = carName;
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }

    public CarName getCarName() {
        return carName;
    }
}
