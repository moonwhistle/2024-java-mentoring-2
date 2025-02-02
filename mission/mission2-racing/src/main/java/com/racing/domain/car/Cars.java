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

    public void saveStartPosition() {
        recordPositionsOfLap(recordPositionsOfCars());
    }

    public void recordProgressOfRace(int numbersOfLaps, ZeroToNineNumberGenerator randomNumberGenerator) {
        for(int i = 0; i < numbersOfLaps; i++) {
            forwardOrStopCars(randomNumberGenerator);
            recordPositionsOfLap(recordPositionsOfCars());
        }
    }

    private void forwardOrStopCars(ZeroToNineNumberGenerator randomNumberGenerator) {
        for(Car car : cars) {
            car.moveForwardOrStop(randomNumberGenerator.generateRandomNumber());
        }
    }

    private void recordPositionsOfLap(LinkedHashMap<String, String> positions) {
        positionRecords.add(positions);
    }

    private LinkedHashMap<String, String> recordPositionsOfCars() {
        LinkedHashMap<String, String> positions = new LinkedHashMap<>();
        for(Car car : cars) {
            positions.put(car.getCarName(), car.getCarPosition());
        }
        return positions;
    }
}
