package com.racing.service;

import com.racing.domain.car.Car;
import com.racing.domain.car.Cars;
import com.racing.domain.car.Ranking;
import com.racing.domain.car.Registration;

import com.racing.dto.RacingResponse;

import java.util.LinkedHashMap;
import java.util.List;

public class RacingService {

    private final Registration registration;
    private final Ranking ranking;

    public RacingService() {
        this.registration = new Registration();
        this.ranking = new Ranking();
    }

    public List<Car> getNamesOfCars(String carNames) {
        String[] names = registration.findOutNamesOfCars(carNames);
        return registration.registerCars(names);
    }

    public RacingResponse getRacingResponse(List<Car> cars, int numbersOfLaps) {
        List<LinkedHashMap<String,String>> racingRecord = getProgressOfRacing(cars, numbersOfLaps);
        String winner = getWinner(racingRecord);
        return new RacingResponse(winner, racingRecord);
    }

    private List<LinkedHashMap<String, String>> getProgressOfRacing(List<Car> cars, int numbersOfLaps) {
        Cars racingCars = new Cars(cars);
        List<LinkedHashMap<String, String>> racingRecord = racingCars.saveStartPosition();
        racingCars.recordProgressOfRace(numbersOfLaps, racingRecord);
        return racingRecord;
    }

    private String getWinner(List<LinkedHashMap<String, String>> racingRecord) {
        LinkedHashMap<String,String> lastLap = ranking.getLastLap(racingRecord);
        int maxPosition = ranking.findMaxPosition(lastLap);
        List<String> nameOfWinner = ranking.findNameOfWinner(lastLap, maxPosition);
        return ranking.joinWinner(nameOfWinner);
    }
}
