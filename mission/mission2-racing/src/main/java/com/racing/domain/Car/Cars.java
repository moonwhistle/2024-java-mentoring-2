package com.racing.domain.Car;

import com.racing.domain.vo.RandomValue;

import java.util.Arrays;
import java.util.List;

public class Cars {

    private final int STANDARD_MOVING_CAR = 4;

    private final List<Car> cars;
    private final RandomValue randomValue;

    public Cars(List<Car> cars, RandomValue randomValue) {
        this.cars = cars;
        this.randomValue = randomValue;
    }

    public String[] carNameSharing(String carName) {
        return Arrays.stream(carName.split(","))
                .map(String::trim)
                .toArray(String[]::new);
    }

    public void addListCarName(String[] carName) {
        for (String name : carName) {
            cars.add(new Car(name.trim()));
        }
    }

    public void whichCarMove() {
        for (Car car : cars) {
            forwardCars(car);

        }
    }

    private void forwardCars(Car car) {
        if (checkMove()) {
            car.move();
        }
    }

    private boolean checkMove() {
        return randomValue.randomValue() >= STANDARD_MOVING_CAR;
    }
}
