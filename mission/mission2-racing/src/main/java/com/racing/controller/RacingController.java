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

    public RacingController(InputView inputView, OutputView outputView, GenerateRandom generateRandom, CarsService carsService){
        this.inputView = inputView;
        this.outputView = outputView;
        this.generateRandom = generateRandom;
        this.carsService = carsService;
    }

    public void startCarsMove(){
        List<String> carNames = inputView.inputName();
        Cars cars = new Cars(carNames, generateRandom);
        this.carsService = new CarsService(cars);
        int numberOfMove = inputView.integerInput();
        outputView.printDefault();

        for(int i = startIndex; i < numberOfMove; i++){
            cars.carsMove();
            outputView.printCarsMove(carsService.carsDetail());
        }

        List<String> winner = carsService.winnerList();
        outputView.printWinner(winner);
    }

}
