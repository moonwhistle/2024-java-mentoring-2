package com.racing.domain.car;

public class Car {

    private final CarName carName;
    private int state;

    public Car(String carName) {
        state = 0;
        this.carName = new CarName(carName);
    }

    public int moveOrStop(int randomNumber) {
        if (randomNumber >= 4) {
            state++;
        }
        return state;
    }
}
