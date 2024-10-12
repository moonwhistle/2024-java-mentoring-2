package com.racing.controller;

import com.racing.domain.Car;
import com.racing.domain.GenerateRandom;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarController {

    private final InputView inputView;
    private final OutputView outputView;
    private final GenerateRandom generateRandom;

    public CarController(final InputView inputView, final OutputView outputView, GenerateRandom generateRandom){
            this.inputView = inputView;
            this.outputView = outputView;
            this.generateRandom = generateRandom;
    }

    public void startCarMove(){
        Car car = new Car(inputView.input(), generateRandom);
        int randomNumber = car.getRandomNumber();
        car.carMove(randomNumber);
        int carPosition = car.getPosition();
        outputView.printResult(carPosition);
    }

}
