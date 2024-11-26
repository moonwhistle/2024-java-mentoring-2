package com.racing.domain.car;

import java.util.HashMap;
import java.util.List;

public class Racing {

    private void registerCar(List<Car> cars) {
        HashMap<Car, Integer> CarStatus = new HashMap<>();
        for (Car car : cars) {
            CarStatus.put(car, 0);
        }
    }

}
