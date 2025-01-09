package com.racingcar.domain;

import com.racingcar.domain.vo.Car;

import java.util.List;
import java.util.NoSuchElementException;

public class CarsLogic {


    public List<String> getWinnerList(List<Car> cars, int winnerPosition) {
        return cars.stream()
                .filter(car -> car.getPosition() == winnerPosition)
                .map(Car::getName)
                .toList();
    }

    public int getMaxPosition(List<Car> cars) {
        List<Integer> positions = getPositionList(cars);

        return positions.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    private List<Integer> getPositionList(List<Car> cars) {
        return cars.stream()
                .map(Car::getPosition)
                .toList();
    }
}
