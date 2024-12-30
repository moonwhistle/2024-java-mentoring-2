package com.racing.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getNamesOfCars() {
        List<String> namesOfCars = new ArrayList<>();
        for (Car car : cars) {
            namesOfCars.add(car.getCarName());
        }
        return namesOfCars;
    }

    public List<Integer> getPositionsOfCars() {
        List<Integer> positionsOfCars = new ArrayList<>();
        for (Car car : cars) {
            positionsOfCars.add(car.getPosition());
        }
        return positionsOfCars;
    }

}
