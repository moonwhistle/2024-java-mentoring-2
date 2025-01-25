package com.racing.domain.system;

import com.racing.domain.car.Car;
import com.racing.domain.car.CarName;

import java.util.ArrayList;
import java.util.List;

public class Registration {

    private static final String SPLIT_SYMBOL = ",";

    public String[] splitNamesOfCars(String names) {
        return names.split(SPLIT_SYMBOL);
    }

    public List<Car> registerCars(String[] namesOfCars) {
        List<Car> cars = new ArrayList<>();
        for (String name : namesOfCars) {
            cars.add(new Car(new CarName(name)));
        }
        return cars;
    }
}
