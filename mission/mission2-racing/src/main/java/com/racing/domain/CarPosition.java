package com.racing.domain;

public class CarPosition {

    private static final int START_POSITION = 0;
    private int carPosition;

    public CarPosition() {
        this.carPosition = START_POSITION;
    }

    public int getCarPosition() {
        return carPosition;
    }
}
