package com.racing.domain.car;

public class Car {

    private static final String POSITION_POINT = "-";
    private static final int THRESHOLD_TO_MOVE = 4;

    private String carPosition;
    private final CarName carName;

    public Car(final CarName carName) {
        carPosition = POSITION_POINT;
        this.carName = carName;
    }

    public void moveForwardOrStop(int randomNumber) {
        if(randomNumber >= THRESHOLD_TO_MOVE) {
            forwardCar();
        }
    }

    public String getCarPosition() {
        return carPosition;
    }

    public String getCarName() {
        return carName.getName();
    }

    private void forwardCar() {
        carPosition+=POSITION_POINT;
    }
}
