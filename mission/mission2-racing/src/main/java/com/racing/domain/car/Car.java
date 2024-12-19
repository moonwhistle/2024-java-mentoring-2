package com.racing.domain.car;

public class Car {

    private int state;
    private final CarName carName;

    public Car(final String carName) {
        state = 0;
        this.carName = new CarName(carName);
    }

}
