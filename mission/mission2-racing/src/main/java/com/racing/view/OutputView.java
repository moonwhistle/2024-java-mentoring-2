package com.racing.view;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;

public class OutputView {

    public void showLapRecord(Cars cars) {
        System.out.println();
        for(Car car : cars.getCars()) {
            System.out.println(car.getCarName() + " : " + car.getPosition());
        }
        System.out.println();
    }

    public void showWinner(String winner) {
        System.out.println(winner + "가 최종 우승했습니다.");
    }

}
