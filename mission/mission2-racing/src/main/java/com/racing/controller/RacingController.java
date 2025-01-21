package com.racing.controller;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;
import com.racing.domain.number.ZeroToNineNumberGenerator;

import com.racing.dto.RacingRequest;
import com.racing.dto.RacingResponse;

import com.racing.service.RacingService;

import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.List;

public class RacingController {

    private final RacingService racingService;
    private final ZeroToNineNumberGenerator randomNumberGenerator;
    private final InputView inputView;
    private final OutputView outputView;

    public RacingController(RacingService racingService, ZeroToNineNumberGenerator randomNumberGenerator,InputView inputView, OutputView outputView) {
        this.racingService = racingService;
        this.randomNumberGenerator = randomNumberGenerator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void startRacing() {
        RacingRequest racingRequest = createRequest();
        outputView.showResultComment();
        raceCars(racingRequest);
        RacingResponse racingResponse = racingService.getRacingResponse(racingRequest);
        showRacingResult(racingResponse);
    }

    private void showRacingResult(RacingResponse racingResponse) {
        outputView.showWinner(racingResponse.winner());
    }

    private RacingRequest createRequest() {
        String namesOfCars = inputView.receiveCars();
        int numberOfLaps = inputView.receiveNumbersOfLap();
        return racingService.getRacingRequest(namesOfCars, numberOfLaps);
    }

    private void raceCars(RacingRequest racingRequest) {
        showPositionOfCarsForEachLap(racingRequest);
        showPositionsOfForOneLap(racingRequest);
    }

    private void showPositionOfCarsForEachLap(RacingRequest racingRequest) {
        List<Car> namesOfCars = racingRequest.namesOfCars();
        int numberOfLaps = racingRequest.numbersOfLaps();
        Cars racingCars = new Cars(namesOfCars);
        for (int i=0; i < numberOfLaps; i++) {
            showPositionsOfForOneLap(racingRequest);
            racingCars.forwardOrStopCars(randomNumberGenerator);
        }
    }

    private void showPositionsOfForOneLap(RacingRequest racingRequest) {
        for (Car car : racingRequest.namesOfCars()) {
            outputView.showLapRecord(car.getCarName(), car.getCarPosition());
        }
    }
}
