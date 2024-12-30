package com.racing.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Registration {

    private static final String SPLIT_SYMBOL = ",";

    public List<Car> registerCars(String namesOfCars) {
        List<Car> cars = new ArrayList<>();
        String[] separatedNamesOfCars = separateNamesOfCars(namesOfCars);
        for (String name : separatedNamesOfCars) {
            cars.add(new Car(name));
        }
        return cars;
    }

    private String[] separateNamesOfCars(String namesOfCars) {
        return namesOfCars.split(SPLIT_SYMBOL);
    }
}
