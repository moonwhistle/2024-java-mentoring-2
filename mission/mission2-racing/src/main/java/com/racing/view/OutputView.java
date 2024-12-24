package com.racing.view;

import com.racing.domain.car.Car;

import java.util.List;

public class OutputView {

    public void showRacingCarsName(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getCarName());
        }
    }

    public void showCarsPosition(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getPosition());
        }
    }

    public void showWinner(List<String> winner) {
        System.out.println(winner);
    }

}
