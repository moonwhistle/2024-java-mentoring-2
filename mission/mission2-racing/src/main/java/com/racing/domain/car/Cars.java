package com.racing.domain.car;

import com.racing.domain.number.ZeroToNineNumberGenerator;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void forwardOrStopCars(ZeroToNineNumberGenerator randomNumberGenerator) {
        for(Car car : cars) {
            car.moveForwardOrStop(randomNumberGenerator.generateRandomNumber());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
