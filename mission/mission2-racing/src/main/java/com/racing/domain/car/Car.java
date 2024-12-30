package com.racing.domain.car;

public class Car {

    private static final int INITIAL_POSITION_OF_CAR = 0;
    private static final int THRESHOLD_OF_CAR_MOVEMENT = 4;

    private int position;
    private final CarName carName;

    public Car(final String carName) {
        position = INITIAL_POSITION_OF_CAR;
        this.carName = new CarName(carName);
    }

    public void driveCar(int randomNumber) {
        if (randomNumber >= THRESHOLD_OF_CAR_MOVEMENT) {
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
