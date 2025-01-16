package com.racing.service;

import com.racing.domain.car.Car;

import java.util.ArrayList;
import java.util.List;

public class Ranking {

    private static final String JOINING_SYMBOL = ",";

    public String findWinner(List<Car> cars) {
        List<String> winner = new ArrayList<>();
        int maxPosition = findMaxPosition(cars);
        for (Car car : cars) {
            findRightCar(maxPosition, car, winner);
        }
        return String.join(JOINING_SYMBOL, winner);
    }

    private int findMaxPosition(List<Car> cars) {
        return cars.stream()
                .mapToInt(v -> v.getPosition().length())
                .max()
                .orElse(0);
    }

    private void findRightCar(int maxPosition, Car car, List<String> winners) {
        if (maxPosition == car.getPosition().length()) {
            winners.add(car.getCarName());
        }
    }
}
