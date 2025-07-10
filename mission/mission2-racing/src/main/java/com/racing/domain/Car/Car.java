package com.racing.domain.Car;

public class Car {

    private final int OVER_NAME_LENGTH = 5;
    private final int MOVE_CAR = 0;

    public String carName;
    public int moveCar;

    Car(String carName) {
        validateNameLength(carName);
        this.carName = carName;
        this.moveCar = MOVE_CAR;
    }

    public String getCarName() {
        return carName;
    }

    public int getMoveCar() {
        return moveCar;
    }

    public void move() {
        moveCar++;
    }

    private void validateNameLength(String name) {
        if (name.length() > OVER_NAME_LENGTH) {
            throw new IllegalArgumentException("Car name is too long.");
        }
    }
}
