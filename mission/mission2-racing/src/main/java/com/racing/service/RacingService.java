package com.racing.service;

import com.racing.domain.car.Car;
import com.racing.domain.car.Ranking;
import com.racing.domain.car.Registration;

import com.racing.dto.RacingRequest;
import com.racing.dto.RacingResponse;

import java.util.List;

public class RacingService {

    private final Registration registration;
    private final Ranking ranking;

    public RacingService() {
        this.registration = new Registration();
        this.ranking = new Ranking();
    }

    public RacingRequest getRacingRequest(String carNames, int numbersOfLaps) {
        List<Car> cars = getNamesOfCars(carNames);
        return new RacingRequest(cars, numbersOfLaps);
    }

    public RacingResponse getRacingResponse(RacingRequest racingRequest) {
        String winner = ranking.findWinner(racingRequest.namesOfCars());
        return new RacingResponse(winner);
    }

    private List<Car> getNamesOfCars(String carNames) {
        String[] names = registration.splitNamesOfCars(carNames);
        return registration.registerCars(names);
    }
}
