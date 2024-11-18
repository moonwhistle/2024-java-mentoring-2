package com.racing.controller;

import com.racing.domain.Cars;
import com.racing.domain.GenerateRandom;
import com.racing.domain.Name;
import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.List;

public class RacingController {

    private InputView inputView;
    private OutputView outputView;
    private final GenerateRandom generateRandom;
    private Cars cars;
    private final int startIndex = 0;

    public RacingController(InputView inputView, OutputView outputView, GenerateRandom generateRandom){
        this.inputView = inputView;
        this.outputView = outputView;
        this.generateRandom = generateRandom;
    }

    public void startCarsMove(){
        cars = new Cars(inputView.inputName(), generateRandom);

        int numberOfMove = inputView.integerInput();
        outputView.printDefault();
        printCarsMove(startIndex, numberOfMove);

        List<String> winner = cars.winner();
        outputView.printWinner(winner);
    }

    public void printCarsMove(int startIndex, int endIndex){
        for(int i = startIndex; i < endIndex; i++){
            createCarDetail();
        }
    }

    private void createCarDetail(){
        cars.carsMoveOne();
        outputView.carsDetail(cars);
    }

}
