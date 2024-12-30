package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    private List<Car> cars;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    private static final int NUMBER_ZERO = 0;

    public void raceTheCars(RandomNumberGenerator randomNumberGenerator, int numberOfLaps) {
        for (int i = NUMBER_ZERO; i < numberOfLaps; i++) {
            driveCars(randomNumberGenerator);
        }
    }

    public List<String> findWinner(int maxPosition) {
        List<String> winner = new ArrayList<>();
        for (Car car : cars) {
            findRightCar(maxPosition, car, winner);
        }
        return winner;
    }

    public int findMaxPosition() {
        return cars.stream()
                .mapToInt(v -> v.getPosition())
                .max()
                .orElse(0);
    }

    private void findRightCar(int maxPosition, Car car, List<String> winners) {
        if (maxPosition == car.getPosition()) {
            winners.add(car.getCarName());
        }
    }

    private void driveCars(RandomNumberGenerator randomNumberGenerator) {
        for (Car car : cars) {
            car.driveCar(randomNumberGenerator.generateRandomNumber());
        }
    }
}
