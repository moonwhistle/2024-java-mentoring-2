package com.racing.domain.car;

public class Car {

    private static final int THRESHOLD_TO_MOVE = 4;

    private CarPosition carPosition;
    private final CarName carName;

    public Car(final CarName carName) {
        this.carName = carName;
        this.carPosition = new CarPosition();
    }

    public void moveForwardOrStop(int randomNumber) {
        if(checkIsGreater(randomNumber)) {
            carPosition.addPosition();
        }
    }

    public String getCarPosition() {
        return carPosition.getPosition();
    }

    public String getCarName() {
        return carName.getName();
    }

    private boolean checkIsGreater(int randomNumber) {
        return randomNumber >= THRESHOLD_TO_MOVE;
    }
}
