package com.racing.domain.car;

public class Car {

    private int state = 0;
    private final CarName carName;

    public Car(String carName) {
        this.carName = new CarName(carName);
    }

    public int moveForwardOrStop(boolean decision) {
        if (decision) {
            state++;
        }
        return state;
    }

    public int showCarState() {
        return state;
    }

    private boolean isSatisfied(int randomNumber) {
        return randomNumber >= 4;
    }
}
