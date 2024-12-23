package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void racing(RandomNumberGenerator randomNumberGenerator) {
        int numberOfLaps = 4;
        for (int i = 0; i < numberOfLaps; i++) {
            driveCars(randomNumberGenerator);
        }
    }

    public List<Car> findWinner(int maxPosition) {
        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (maxPosition == car.getPosition()) {
                winners.add(car);
            }
        }
        return winners;
    }

    private void driveCars(RandomNumberGenerator randomNumberGenerator) {
        for (Car car : cars) {
            car.driveCar(randomNumberGenerator.generateRandomNumber());
        }
    }
}
