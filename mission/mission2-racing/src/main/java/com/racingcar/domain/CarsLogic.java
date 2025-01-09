package com.racingcar.domain;

import com.racingcar.domain.vo.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class CarsLogic {
    private final String MOVEMENT_CHAR = "-";

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

    public HashMap<String, String> getCarsMovementRecordMap(List<Car> cars){
        HashMap<String, String> recordMap = new HashMap<>();

        for (final Car car : cars) {
            recordMap.put(car.getName(), getVisualizedMovement(car));
        }

        return recordMap;
    }

    public List<Car> getCarList(ArrayList<String> carsArray){
        List<Car> cars = new ArrayList<>();

        for (String name : carsArray) {
            Car car = new Car(name);
            cars.add(car);
        }

        return cars;
    }

    private String getVisualizedMovement(Car car){
        int position = car.getPosition();

        return buildVisualizedCarMovement(position);
    }

    private String buildVisualizedCarMovement(int position) {
        return MOVEMENT_CHAR.repeat(Math.max(0, position));
    }

    private List<Integer> getPositionList(List<Car> cars) {
        return cars.stream()
                .map(Car::getPosition)
                .toList();
    }
}
