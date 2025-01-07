package com.racing.domain.car;

public class Car {

    private static final String MOVING_POINT = "-";
    private static final int THRESHOLD_OF_CAR_MOVEMENT = 4;

    private String position;
    private final CarName carName;

    public Car(final String carName) {
        position = MOVING_POINT;
        this.carName = new CarName(carName);
    }

    public void driveCar(int randomNumber) {
        if (randomNumber >= THRESHOLD_OF_CAR_MOVEMENT) {
            forwardCar();
        }
    }

    public String getPosition() {
        return position;
    }

    public String getCarName() {
        return carName.getCarName();
    }

    private void forwardCar() {
        position = position + MOVING_POINT;
    }
}
