package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void raceCars(RandomNumberGenerator randomNumberGenerator) {
        int numberOfLaps = 4;
        for (int i = 0; i < numberOfLaps; i++) {
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
        int maxPosition = cars.stream().mapToInt(v -> v.getPosition()).max().orElse(0);
        return maxPosition;
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
