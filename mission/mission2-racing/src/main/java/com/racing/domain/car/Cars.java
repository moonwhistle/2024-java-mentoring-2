package com.racing.domain.car;

import com.racing.domain.number.ZeroToNineNumberGenerator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Cars {

    private final List<Car> cars;
    private final List<LinkedHashMap<String, String>> positionRecords;

    public Cars(List<Car> cars) {
        this.cars = cars;
        this.positionRecords = new ArrayList<>();
    }

    public List<LinkedHashMap<String, String>> raceCars(int numbersOfLaps, ZeroToNineNumberGenerator randomNumberGenerator) {
        recordPositionsOfCars();
        for (int i = 0; i < numbersOfLaps; i++) {
            forwardOrStopCars(randomNumberGenerator);
            recordPositionsOfCars();
        }
        return positionRecords;
    }

    public List<Car> getCars() {
        return cars;
    }

    private void forwardOrStopCars(ZeroToNineNumberGenerator randomNumberGenerator) {
        for(Car car : cars) {
            car.moveForwardOrStop(randomNumberGenerator.generateRandomNumber());
        }
    }

    private void recordPositionsOfCars() {
        LinkedHashMap<String, String> positions = recordPosition(cars);
        positionRecords.add(positions);
    }

    private LinkedHashMap<String, String> recordPosition(List<Car> cars) {
        LinkedHashMap<String, String> positions = new LinkedHashMap<>();
        for(Car car : cars) {
            positions.put(car.getCarName(), car.getCarPosition());
        }
        return positions;
    }
}
