package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    private static final String JOINING_SYMBOL = ",";

    public void raceTheCars(List<Car> cars,RandomNumberGenerator randomNumberGenerator) {
        for (Car car : cars) {
            car.driveCar(randomNumberGenerator.generateRandomNumber());
        }
    }

    public String findWinner(List<Car> cars, int maxPosition) {
        List<String> winner = new ArrayList<>();
        for (Car car : cars) {
            findRightCar(maxPosition, car, winner);
        }
        return String.join(JOINING_SYMBOL, winner);
    }

    public int findMaxPosition(List<Car> cars) {
        return cars.stream()
                .mapToInt(v -> v.getPosition().length())
                .max()
                .orElse(0);
    }

    private void findRightCar(int maxPosition, Car car, List<String> winners) {
        if (maxPosition == car.getPosition().length()) {
            winners.add(car.getCarName());
        }
    }

}
