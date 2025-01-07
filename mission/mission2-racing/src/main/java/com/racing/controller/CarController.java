package com.racing.controller;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;
import com.racing.domain.car.Racing;
import com.racing.domain.car.Registration;
import com.racing.domain.number.RandomNumberGenerator;

import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.List;

public class CarController {

    private final Racing racing;
    private final Registration registration;
    private final RandomNumberGenerator randomNumberGenerator;
    private final OutputView outputView;
    private final InputView inputview;

    public CarController(Racing racing, Registration registration, RandomNumberGenerator generateRacingRandomNumber, OutputView outputView, InputView inputview) {
        this.racing = racing;
        this.registration = registration;
        this.randomNumberGenerator = generateRacingRandomNumber;
        this.outputView = outputView;
        this.inputview = inputview;
    }

    public void run() {
        String namesOfCar = inputview.receiveCarName();
        int numberOfLaps = inputview.receiveNumberOfLaps();
        List<Car> cars = registration.registerCars(namesOfCar);
        Cars racingCars = new Cars(cars);
        System.out.println("실행 결과");
        System.out.println();
        outputView.showLapRecord(racingCars);
        for (int i = 0; i < numberOfLaps; i++) {
            racing.raceTheCars(cars, randomNumberGenerator);
            outputView.showLapRecord(racingCars);
        }
        int maxPosition = racing.findMaxPosition(cars);
        String winner = racing.findWinner(cars, maxPosition);
        outputView.showWinner(winner);
    }
}
