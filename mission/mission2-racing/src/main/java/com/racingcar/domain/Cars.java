package com.racingcar.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class Cars {
    private final Integer MOVE_BOUND_NUMBER = 4;
    private final Integer MOVE_STATE = 1;
    private final Integer STOP_STATE = 0;

    private final List<Car> cars;
    private final RandomNumberGenerator zeroToNineGenerator;
    private final ArrayList<HashMap<String, Integer>> carsMovementRecord;

    public Cars(final ArrayList<String> carsArray) {
        this.cars = makeCars(carsArray);
        this.zeroToNineGenerator = new ZeroToNineGenerator();
        this.carsMovementRecord = new ArrayList<>();
    }

    private List<Car> makeCars(ArrayList<String> carsArray) {
        List<Car> cars = new ArrayList<>();

        for (String name : carsArray) {
            Car car = new Car(name);
            cars.add(car);
        }

        return cars;
    }

    public void moveCars() {
        for (final Car car : cars) {
            int randomNumber = zeroToNineGenerator.getRandomNumber();
            int moveState = getCarMoveState(randomNumber);
            car.move(moveState);
        }

        recordCarMovement();
    }

    public void recordCarMovement() {
        HashMap<String, Integer> map = new HashMap<>();

        for (final Car car : cars) {
            map.put(car.getName(), car.getPosition());
        }

        this.carsMovementRecord.add(map);
    }

    public ArrayList<HashMap<String, Integer>> getCarsMovementRecord() {
        return this.carsMovementRecord;
    }

    private int getCarMoveState(int randomNumber) {
        if (randomNumber >= MOVE_BOUND_NUMBER) {
            return MOVE_STATE;
        }

        return STOP_STATE;
    }

    public List<String> getWinner() {
        int winnerPosition = getMaxPosition();

        return cars.stream()
                .filter(car -> car.getPosition() == winnerPosition)
                .map(Car::getName)
                .toList();
    }

    private int getMaxPosition() {
        List<Integer> positions = cars.stream()
                .map(Car::getPosition)
                .toList();

        return positions.stream()
                .mapToInt(x -> x)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }
}
