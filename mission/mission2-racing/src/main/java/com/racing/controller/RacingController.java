package com.racing.controller;

import com.racing.dto.RacingRequest;
import com.racing.dto.RacingResponse;

import com.racing.service.RacingService;

import com.racing.view.InputView;
import com.racing.view.OutputView;

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
        RacingRequest racingRequest = createRequest();
        outputView.showResultComment();
        RacingResponse racingResponse = racingService.getRacingResponse(racingRequest);
        outputView.showRaceProgress(racingResponse.racingProgress());
        outputView.showWinner(racingResponse.winner());
    }

    private RacingRequest createRequest() {
        String namesOfCars = inputView.receiveCars();
        int numberOfLaps = inputView.receiveNumbersOfLap();
        return racingService.getRacingRequest(namesOfCars, numberOfLaps);
    }
}
