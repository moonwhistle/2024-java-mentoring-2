package com.racing.dto;

import com.racing.domain.car.Car;

import java.util.List;

public class RacingRequest {

    private final List<Car> namesOfCar;
    private final int numberOfLaps;

    public RacingRequest(List<Car> namesOfCar, int numberOfLaps) {
        this.namesOfCar = namesOfCar;
        this.numberOfLaps = numberOfLaps;
    }

    public List<Car> getNamesOfCar() {
        return namesOfCar;
    }

    public int getNumberOfLaps() {
        return numberOfLaps;
    }
}
