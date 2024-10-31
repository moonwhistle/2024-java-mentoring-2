package com.racing.domain.car;

import java.util.ArrayList;
import java.util.List;

public class Car {

    public List<String> saveCarName(String carName) {
        List<String> carNames = new ArrayList<>();
        carNames.add(carName);
        return carNames;
    }

}
