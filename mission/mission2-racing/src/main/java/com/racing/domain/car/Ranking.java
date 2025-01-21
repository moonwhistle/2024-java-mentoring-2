package com.racing.domain.car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ranking {

    private static final String JOINING_SYMBOL = ",";

    public String findWinner(List<Car> cars) {
        List<String> winner = new ArrayList<>();
        int maxPosition = findMaxPosition(cars);
        for (Car car : cars) {
            findRightCar(maxPosition, car, winner);
        }
        return joinWinner(winner);
    }

    private int findMaxPosition(List<Car> cars) {
        List<String> positions = findAllPositions(cars);
        return positions.stream()
                .mapToInt(v -> v.length())
                .max()
                .orElse(0);
    }

    private List<String> findAllPositions(List<Car> cars) {
        return cars.stream()
                .map(Car::getCarPosition)
                .collect(Collectors.toList());
    }

    private void findRightCar(int maxPosition, Car car, List<String> winner) {
        if (maxPosition == car.getCarPosition().length()) {
            winner.add(car.getCarName());
        }
    }

    private String joinWinner(List<String> winner) {
        return String.join(JOINING_SYMBOL, winner);
    }
}
