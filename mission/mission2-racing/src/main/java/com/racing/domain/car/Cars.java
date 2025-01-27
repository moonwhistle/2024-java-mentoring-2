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

    public List<Car> getCars() {
        return cars;
    }

    public List<LinkedHashMap<String, String>> getPositionRecords() {
        return positionRecords;
    }

    public void forwardOrStopCars(ZeroToNineNumberGenerator randomNumberGenerator) {
        for(Car car : cars) {
            car.moveForwardOrStop(randomNumberGenerator.generateRandomNumber());
        }
    }

    public void recordPositionsOfLap(LinkedHashMap<String, String> positions) {
        positionRecords.add(positions);
    }

    public LinkedHashMap<String, String> recordPositionsOfCars() {
        LinkedHashMap<String, String> positions = new LinkedHashMap<>();
        for(Car car : cars) {
            positions.put(car.getCarName(), car.getCarPosition());
        }
        return positions;
    }
}
