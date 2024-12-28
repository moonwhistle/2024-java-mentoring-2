package com.racing.domain.car;

import com.racing.domain.number.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    private static final int NUMBER_OF_Cars = 4;
    private static final int NUMBER_OF_RACE_LAPS = 4;
    private static final int NUMBER_ZERO = 0;

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> makeCars() {
        List<Car> carEntry = new ArrayList<>();
        List<String> NamesOfCars = Arrays.asList("a", "b", "c", "d");
        for (String nameOfCar : NamesOfCars) {
            carEntry.add(new Car(nameOfCar));
        }
        return carEntry;
    }

    public void raceCars(RandomNumberGenerator randomNumberGenerator) {
        for (int i = NUMBER_ZERO; i < NUMBER_OF_RACE_LAPS; i++) {
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

    public List<Car> getCars() {
        return cars;
    }

    public List<String> getNamesOfCars() {
        List<String> namesOfCars = new ArrayList<>();
        for (Car car : cars) {
            namesOfCars.add(car.getCarName());
        }
        return namesOfCars;
    }

    public List<Integer> getPositionsOfCars() {
        List<Integer> positionsOfCars = new ArrayList<>();
        for (Car car : cars) {
            positionsOfCars.add(car.getPosition());
        }
        return positionsOfCars;
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
