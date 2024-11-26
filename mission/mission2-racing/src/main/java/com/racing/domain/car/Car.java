package com.racing.domain.car;

public class Car {

    private int state = 0;
    private final CarName carName;

    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public int moveOrStop(boolean isSatisfied) {
        if (isSatisfied) {
            state++;
        }
        return state;
    }

    public int showCarState() {
        return state;
    }
}
