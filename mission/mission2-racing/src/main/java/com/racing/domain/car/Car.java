package com.racing.domain.car;

public class Car {

    private static final int INITIAL_POSITION = 0;
    private static final int MOVEMENT_THRESHOLD = 4;

    private int position;
    private final CarName carName;

    public Car(final String carName) {
        position = INITIAL_POSITION;
        this.carName = new CarName(carName);
    }

    public void driveCar(int randomNumber) {
        if (randomNumber >= MOVEMENT_THRESHOLD) {
            forwardCar();
        }
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return carName.getCarName();
    }

    private void forwardCar() {
        position++;
    }
}
