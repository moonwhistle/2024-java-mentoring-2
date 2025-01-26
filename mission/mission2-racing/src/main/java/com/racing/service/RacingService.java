package com.racing.service;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;
import com.racing.domain.number.ZeroToNineNumberGenerator;
import com.racing.domain.system.Ranking;
import com.racing.domain.system.Registration;

import com.racing.dto.RacingRequest;
import com.racing.dto.RacingResponse;

import java.util.LinkedHashMap;
import java.util.List;

public class RacingService {

    private final ZeroToNineNumberGenerator randomNumberGenerator;
    private final Registration registration;
    private final Ranking ranking;

    public RacingService() {
        this.registration = new Registration();
        this.ranking = new Ranking();
        this.randomNumberGenerator = new ZeroToNineNumberGenerator();
    }

    public RacingRequest getRacingRequest(String carNames, int numbersOfLaps) {
        List<Car> cars = getNamesOfCars(carNames);
        return new RacingRequest(cars, numbersOfLaps);
    }

    public RacingResponse getRacingResponse(RacingRequest racingRequest) {
        List<LinkedHashMap<String,String>> racingRecord = getProgressOfRacing(racingRequest.namesOfCars(), racingRequest.numbersOfLaps());
        String winner = getWinner(racingRecord);
        return new RacingResponse(winner, racingRecord);
    }

    private List<Car> getNamesOfCars(String carNames) {
        String[] names = registration.findOutNamesOfCars(carNames);
        return registration.registerCars(names);
    }

    private List<LinkedHashMap<String, String>> getProgressOfRacing(List<Car> cars, int numbersOfLaps) {
        Cars racingCars = new Cars(cars);
        racingCars.recordPositionsOfLap();
        for (int i = 0; i < numbersOfLaps; i++) {
            racingCars.forwardOrStopCars(randomNumberGenerator);
            racingCars.recordPositionsOfLap();
        }
        return racingCars.getPositionRecords();
    }

    private String getWinner(List<LinkedHashMap<String, String>> racingRecord) {
        LinkedHashMap<String,String> lastLap = ranking.getLastLap(racingRecord);
        List<String> nameOfWinner = ranking.findNameOfWinner(lastLap);
        return ranking.joinWinner(nameOfWinner);
    }
}
