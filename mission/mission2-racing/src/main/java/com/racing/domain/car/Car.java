package com.racing.domain.car;

public class Car {

    private int state;
    private final CarName carName;

    public Car(final String carName) {
        state = 0;
        this.carName = new CarName(carName);
    }

    public int moveOrStopCar(int randomNumber) {
        if (randomNumber >= 4) {
            return state++;
        }
        return state;
    }

    public int getState() {
        return state;
    }

    public String getCarName() {
        return carName.getCarName();
    }

}
