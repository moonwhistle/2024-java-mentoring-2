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
        String namesOfCars = inputview.receiveCarName();
        int numberOfLaps = inputview.receiveNumberOfLaps();
        List<Car> registeredCars = registration.registerCars(namesOfCars);
        racing.raceTheCars(randomNumberGenerator, numberOfLaps, registeredCars);
        int maxPositionOfCars = racing.findMaxPosition(registeredCars);
        List<String> winner = racing.findWinner(maxPositionOfCars, registeredCars);
        Cars racingCars = new Cars(registeredCars);
        outputView.showRacingCarsName(racingCars.getNamesOfCars());
        outputView.showCarsPosition(racingCars.getPositionsOfCars());
        outputView.showWinner(winner);
    }
}
