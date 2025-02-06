package com.racing.controller;

import com.racing.domain.car.Car;

import com.racing.dto.RacingResponse;

import com.racing.service.RacingService;

import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.List;

public class RacingController {

    private final RacingService racingService;
    private final InputView inputView;
    private final OutputView outputView;

    public RacingController(RacingService racingService, InputView inputView, OutputView outputView) {
        this.racingService = racingService;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startRacing() {
        String namesOfCars = inputView.receiveCars();
        int numberOfLaps = inputView.receiveNumbersOfLap();
        List<Car> cars = racingService.getNamesOfCars(namesOfCars);
        outputView.showResultComment();
        RacingResponse racingResponse = racingService.getRacingResponse(cars, numberOfLaps);
        outputView.showRaceProgress(racingResponse.racingProgress());
        outputView.showWinner(racingResponse.winner());
    }
}
