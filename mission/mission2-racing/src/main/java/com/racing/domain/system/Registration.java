package com.racing.domain.system;

import com.racing.domain.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Registration {

    private static final String SPLIT_SYMBOL = ",";

    public String[] findOutNamesOfCars(String names) {
        return splitNamesOfCars(names);
    }

    public List<Car> registerCars(String[] namesOfCars) {
        List<Car> cars = new ArrayList<>();
        for (String name : namesOfCars) {
            cars.add(new Car(name));
        }
        return cars;
    }

    private String[] splitNamesOfCars(String names) {
        return names.split(SPLIT_SYMBOL);
    }
}
