package com.racing.controller;

import com.racing.domain.Car;
import com.racing.domain.GenerateRandom;
import com.racing.view.InputView;

public class CarController {

    private final InputView inputView;
    private final GenerateRandom generateRandom;

    public CarController(final InputView inputView, GenerateRandom generateRandom){
            this.inputView = inputView;
            this.generateRandom = generateRandom;
        }

        public void startCarMove(){
            Car car = new Car(inputView.input(), generateRandom);
            int randomNumber = car.getRandomNumber();
            int moveOrStop = car.checkMove(randomNumber);
            car.carMove(moveOrStop);
            car.getPosition();
        }
    }
