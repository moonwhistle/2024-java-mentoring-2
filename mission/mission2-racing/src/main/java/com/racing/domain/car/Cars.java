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

    public List<String> findWinner(int maxPosition) {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            findRightCar(maxPosition, car, winners);
        }
        return winners;
    }

    public int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            renewMaxPosition(maxPosition, car);
        }
        return maxPosition;
    }

    private void renewMaxPosition(int maxPosition, Car car) {
        if (car.getPosition() > maxPosition) {
            maxPosition = car.getPosition();
        }
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
