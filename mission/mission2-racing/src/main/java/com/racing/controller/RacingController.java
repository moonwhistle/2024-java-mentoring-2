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
    private GenerateRandom generateRandom;
    private final int startIndex = 0;
    private CarsService carsService;

    public RacingController(InputView inputView, OutputView outputView, GenerateRandom generateRandom){
        this.inputView = inputView;
        this.outputView = outputView;
        this.generateRandom = generateRandom;
    }

    public Cars getCars(){
        String carNames = inputView.inputName();
        Cars cars = new Cars(carNames, generateRandom);
        return cars;
    }

    public void startCarsMove(Cars cars){
        this.carsService = new CarsService(cars);
        int numberOfMove = inputView.integerInput();

        outputView.printDefault();

        String carDetailList = cars.carsMoveAll(startIndex, numberOfMove);
        outputView.printCarsMove(carDetailList);

        List<Name> winnerName = carsService.winnerName(cars.getCarsPosition());
        List<String> winner = carsService.winner(winnerName);
        outputView.printWinner(winner);
    }

}
