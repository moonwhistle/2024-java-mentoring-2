package com.racing.controller;

import com.racing.domain.Car;
import com.racing.domain.GenerateRandom;
import com.racing.service.CarsService;
import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarsController {

    private InputView inputView;
    private OutputView outputView;
    private GenerateRandom generateRandom;
    private final int startIndex = 0;
    private CarsService carsService;

    public CarsController(InputView inputView, OutputView outputView, GenerateRandom generateRandom, CarsService carsService){
        this.inputView = inputView;
        this.outputView = outputView;
        this.generateRandom = generateRandom;
        this.carsService = carsService;
    }


}
