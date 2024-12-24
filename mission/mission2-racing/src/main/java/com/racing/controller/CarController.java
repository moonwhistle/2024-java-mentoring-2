package com.racing.controller;

import com.racing.domain.number.RandomNumberGenerator;

import com.racing.view.InputView;
import com.racing.view.OutputView;

public class CarController {

    private final RandomNumberGenerator randomNumberGenerator;
    private final OutputView outputView;
    private final InputView inputview;

    public CarController(RandomNumberGenerator generateRacingRandomNumber, OutputView outputView, InputView inputview) {
        this.randomNumberGenerator = generateRacingRandomNumber;
        this.outputView = outputView;
        this.inputview = inputview;
    }
}
