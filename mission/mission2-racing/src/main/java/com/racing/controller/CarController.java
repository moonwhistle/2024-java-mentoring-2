package com.racing.controller;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;
import com.racing.domain.number.RandomNumberGenerator;

import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.Arrays;
import java.util.List;

public class CarController {

    private final RandomNumberGenerator randomNumberGenerator;
    private final OutputView outputView;
    private final InputView inputview;

    public CarController(RandomNumberGenerator generateRacingRandomNumber, OutputView outputView, InputView inputview) {
        this.randomNumberGenerator = generateRacingRandomNumber;
        this.outputView = outputView;
        this.inputview = inputview;
    }

    public List<Car> registerCars() {
        Car neo = new Car("neo");
        Car brie = new Car("brie");
        Car brown = new Car("brown");
        return Arrays.asList(neo,brie,brown);
    }

    public void run() {
        Cars registeredCars = new Cars(registerCars());
        registeredCars.raceCars(randomNumberGenerator);
        int maxPosition = registeredCars.findMaxPosition();
        List<Car> racedCars = registeredCars.getCars();
        outputView.showRacingCarsName(racedCars);
        List<String> winner = registeredCars.findWinner(maxPosition);
        outputView.showCarsPosition(racedCars);
        outputView.showWinner(winner);
    }

}
