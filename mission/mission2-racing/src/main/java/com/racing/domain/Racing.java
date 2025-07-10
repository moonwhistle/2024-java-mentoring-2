package com.racing.domain;

import com.racing.domain.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    public static final String COMMA = ", ";

    private final List<Car> cars;

    public Racing(List<Car> cars) {
        this.cars = cars;
    }

    public int maxMoveNumber() {
        return validateMathMaxNumber();
    }

    public List<String> winnerName(int maxMove) {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            addWinner(winners, car, maxMove);
        }
        return winners;
    }

    public String listToString(List<String> carNames) {
        return String.join(COMMA, carNames);
    }



    private void addWinner(List<String> winners, Car car, int maxMove) {
        if (car.getMoveCar() == maxMove) {
            winners.add(car.getCarName());
        }
    }

    private int validateMathMaxNumber() {
        int maxMove = Value.MAX_ZERO_NUMBER.getValue();
        for (Car car : cars) {
            maxMove = Math.max(maxMove, car.getMoveCar());
        }
        return maxMove;
    }
}

