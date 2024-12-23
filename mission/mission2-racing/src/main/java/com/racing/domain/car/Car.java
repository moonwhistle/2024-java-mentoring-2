package com.racing.domain.car;

public class Car {

    private int position;
    private final CarName carName;

    public Car(final String carName) {
        position = 0;
        this.carName = new CarName(carName);
    }

    public void driveCar(int randomNumber) {
        if (randomNumber >= 4) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getCarName() {
        return carName.getCarName();
    }

}
