package com.racing.domain.car;

public class Car {

    private final String carName;
    private int state;

    public Car(String carName) {
        state = 0;
        this.carName = carName;
    }

    public int moveOrStop(int randomNumber) {
        if (randomNumber >= 4) {
            state++;
        }
        return state;
    }
}
