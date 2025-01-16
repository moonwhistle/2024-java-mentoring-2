package com.racing.controller;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;
import com.racing.domain.number.RandomNumberGenerator;

import com.racing.dto.RacingRequest;
import com.racing.dto.RacingResponse;

import com.racing.service.Ranking;
import com.racing.service.Registration;

import com.racing.view.InputView;
import com.racing.view.OutputView;

import java.util.List;

public class CarController {

    private final Ranking ranking;
    private final Registration registration;
    private final RandomNumberGenerator randomNumberGenerator;
    private final OutputView outputView;
    private final InputView inputview;

    public CarController(Ranking ranking, Registration registration, RandomNumberGenerator generateRacingRandomNumber, OutputView outputView, InputView inputview) {
        this.ranking = ranking;
        this.registration = registration;
        this.randomNumberGenerator = generateRacingRandomNumber;
        this.outputView = outputView;
        this.inputview = inputview;
    }

    public void startRacingGame() {
        RacingRequest racingRequest = showRacingRequest();
        outputView.showResultComment();
        showPositionOfCarsForEachLap(racingRequest);
        RacingResponse racingResponse = showRacingResponse(racingRequest);
        showRacingResult(racingResponse);
    }

    private RacingResponse showRacingResponse(RacingRequest racingRequest) {
        String winner = ranking.findWinner(racingRequest.getNamesOfCar());
        return new RacingResponse(winner);
    }

    private RacingRequest showRacingRequest() {
        String namesOfCars = inputview.receiveCarName();
        List<Car> cars = registration.registerCars(namesOfCars);
        int numberOfLaps = inputview.receiveNumberOfLaps();
        return new RacingRequest(cars, numberOfLaps);
    }

    private void showRacingResult(RacingResponse racingResponse) {
        outputView.showWinner(racingResponse.getWinner());
    }

    private void showPositionOfCarsForEachLap(RacingRequest racingRequest) {
        Cars racingCars = new Cars(racingRequest.getNamesOfCar());
        for (int i = 0; i < racingRequest.getNumberOfLaps(); i++) {
            showPositionsOfForOneLap(racingRequest.getNamesOfCar());
            racingCars.raceTheCars(racingRequest.getNamesOfCar(), randomNumberGenerator);
        }
        showPositionsOfForOneLap(racingRequest.getNamesOfCar());
    }

    private void showPositionsOfForOneLap(List<Car> cars) {
        for (Car car : cars) {
            outputView.showLapRecord(car.getCarName(), car.getPosition());
        }
    }
}
