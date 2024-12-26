package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private static final int NUMBER_OF_RACE_LAPS = 4;
    private static final int NUMBER_ZERO = 0;
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void raceCars(RandomNumberGenerator randomNumberGenerator) {
        for (int i = NUMBER_ZERO; i < NUMBER_OF_RACE_LAPS; i++) {
            driveCars(randomNumberGenerator);
        }
    }

    public List<String> findWinner() {
        List<String> winner = new ArrayList<>();
        int maxPosition = findMaxPosition();
        for (Car car : cars) {
            findRightCar(maxPosition, car, winner);
        }
        return winner;
    }

    private int findMaxPosition() {
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
