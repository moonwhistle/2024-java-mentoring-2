package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void raceTheCars(List<Car> cars, RandomNumberGenerator randomNumberGenerator) {
        for (Car car : cars) {
            car.driveCar(randomNumberGenerator.generateRandomNumber());
        }
    }

    public List<Car> getCars() {
        return cars;
    }
}
