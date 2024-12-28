package com.racing.controller;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;
import com.racing.domain.number.RandomNumberGenerator;
import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.ArrayList;
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

    public void run() {
        Cars cars = new Cars(new ArrayList<>());
        List<Car> carEntry = cars.makeCars();
        Cars registeredCars = new Cars(carEntry);
        List<String> namesOfRacingCars = registeredCars.getNamesOfCars();
        registeredCars.raceCars(randomNumberGenerator);
        int maxPosition = registeredCars.findMaxPosition();
        List<Integer> positionsOfCars = registeredCars.getPositionsOfCars();
        List<String> winner = registeredCars.findWinner(maxPosition);
        outputView.showRacingCarsName(namesOfRacingCars);
        outputView.showCarsPosition(positionsOfCars);
        outputView.showWinner(winner);
    }

}
