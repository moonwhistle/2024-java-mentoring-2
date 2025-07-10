package com.racing;

import com.racing.controller.RacingController;
import com.racing.domain.Car.Car;
import com.racing.domain.Car.Cars;
import com.racing.domain.Racing;
import com.racing.domain.vo.RandomValue;
import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RacingApplication {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        RacingController racingController = new RacingController(new Cars(cars,new RandomValue(new Random())),
                new Racing(cars), new InputView(new Scanner(System.in)), new OutputView());
        racingController.racingCar();
    }
}
