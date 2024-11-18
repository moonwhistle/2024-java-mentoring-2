package com.racing.controller;

import com.racing.domain.Cars;
import com.racing.domain.GenerateRandom;
import com.racing.domain.Name;
import com.racing.service.CarsService;
import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.List;

public class RacingController {

    private InputView inputView;
    private OutputView outputView;
    private final GenerateRandom generateRandom;
    private final int startIndex = 0;
    private final CarsService carsService;

    public RacingController(InputView inputView, OutputView outputView, GenerateRandom generateRandom, CarsService carsService){
        this.inputView = inputView;
        this.outputView = outputView;
        this.generateRandom = generateRandom;
        this.carsService = carsService;
    }

    public void startCarsMove(){
        Cars cars = carsService.getCars(inputView.inputName(), generateRandom);

        int numberOfMove = inputView.integerInput();

        outputView.printDefault();

        String carDetailList = cars.carsMoveAll(startIndex, numberOfMove);
        outputView.printCarsMove(carDetailList);

        List<Name> winnerName = carsService.winnerName(cars.getCarsPosition());
        List<String> winner = carsService.winner(winnerName);
        outputView.printWinner(winner);
    }

}
