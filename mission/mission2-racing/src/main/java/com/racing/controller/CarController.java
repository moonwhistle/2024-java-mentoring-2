package com.racing.controller;

import com.racing.domain.Car;
import com.racing.domain.ImplementRandomNumber;
import com.racing.domain.RandomNumber;
import com.racing.view.InputView;

import java.util.Random;

public class CarController {

    private final InputView inputView;
    private final ImplementRandomNumber implementRandomNumber = new ImplementRandomNumber();

    public CarController(final InputView inputView){
            this.inputView = inputView;
        }

        public void startCarMove(){
            Car car = new Car(inputView.input());
            int randomNumber = implementRandomNumber.generateRandomNumber();

        }
    }
