package com.racing.domain.car;

public class Car {

    private static final int THRESHOLD_TO_MOVE = 4;

    private CarPosition carPosition;
    private final CarName carName;

    public Car(final CarName carName) {
        this.carName = carName;
    }

    public void driveCar(int randomNumber) {
        if(randomNumber >= THRESHOLD_TO_MOVE) {
            carPosition.addPosition();
        }
    }

    public CarPosition getCarPosition() {
        return carPosition;
    }

    public CarName getCarName() {
        return carName;
    }


}
