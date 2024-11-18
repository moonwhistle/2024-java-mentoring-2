package com.racing.controller;

import com.racing.domain.car.MovingCar;
import com.racing.domain.number.RandomNumberGenerator;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarController {

    private final RandomNumberGenerator randomNumberGenerator;
    private final OutputView outputView;
    private final InputView inputview;
    private final MovingCar movingCar;

    public CarController(RandomNumberGenerator generateRacingRandomNumber, OutputView outputView, InputView inputview, MovingCar movingCar) {
        this.randomNumberGenerator = generateRacingRandomNumber;
        this.outputView = outputView;
        this.inputview = inputview;
        this.movingCar = movingCar;
    }

    public void moveCar() {
        int state = 0;
        int randomNumber = randomNumberGenerator.generateRandomNumber();
        outputView.output(inputview.receiveCarName(), movingCar.decideMove(randomNumber, state));
    }
}
