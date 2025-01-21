package com.racing.domain.car;

import java.util.List;
import java.util.stream.Collectors;

public class Ranking {

    public int findMaxPosition(List<Car> cars) {
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
}
