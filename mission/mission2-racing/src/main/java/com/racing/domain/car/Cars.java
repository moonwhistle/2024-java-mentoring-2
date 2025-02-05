package com.racing.domain.car;

import com.racing.domain.number.ZeroToNineNumberGenerator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<LinkedHashMap<String, String>> saveStartPosition() {
        List<LinkedHashMap<String, String>> positionRecords = new ArrayList<>();
        recordPositionsOfLap(positionRecords, recordPositionsOfCars());
        return positionRecords;
    }

    public void recordProgressOfRace(int numbersOfLaps, List<LinkedHashMap<String, String>> positionRecords) {
        ZeroToNineNumberGenerator randomNumberGenerator = new ZeroToNineNumberGenerator();
        for(int i = 0; i < numbersOfLaps; i++) {
            forwardOrStopCars(randomNumberGenerator);
            recordPositionsOfLap(positionRecords,recordPositionsOfCars());
        }
    }

    private void forwardOrStopCars(ZeroToNineNumberGenerator randomNumberGenerator) {
        for(Car car : cars) {
            car.moveForwardOrStop(randomNumberGenerator.generateRandomNumber());
        }
    }

    private void recordPositionsOfLap(List<LinkedHashMap<String, String>> positionRecords, LinkedHashMap<String, String> positionRecord) {
        positionRecords.add(positionRecord);
    }

    private LinkedHashMap<String, String> recordPositionsOfCars() {
        LinkedHashMap<String, String> positions = new LinkedHashMap<>();
        for(Car car : cars) {
            positions.put(car.getCarName(), car.getCarPosition());
        }
        return positions;
    }
}
