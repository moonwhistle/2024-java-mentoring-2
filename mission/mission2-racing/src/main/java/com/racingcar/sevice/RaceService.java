package com.racingcar.sevice;

import com.racingcar.controller.dto.RequestDTO;
import com.racingcar.controller.dto.ResponseDTO;

import com.racingcar.domain.vo.Cars;
import com.racingcar.domain.vo.IntegerParser;
import com.racingcar.domain.RacingCarLogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RaceService {
    private final RacingCarLogic racingCarLogic;
    private final IntegerParser integerParser;

    public RaceService() {
        this.racingCarLogic = new RacingCarLogic();
        this.integerParser = new IntegerParser();
    }

    public ResponseDTO raceCar(RequestDTO inputViewRequestDTO) {
        ArrayList<String> carNames = getCarNames(inputViewRequestDTO.carNames());
        int tryCount = getTryCount(inputViewRequestDTO.tryCount());

        Cars movedCars = getMovedCars(carNames, tryCount);

        return buildResponseDTO(movedCars);
    }

    private ResponseDTO buildResponseDTO(Cars movedCars){
        ArrayList<HashMap<String, String>> visualizedCarsMovement
                = racingCarLogic.getVisualizedCarsMovementList(movedCars);
        String winners = getWinners(movedCars);

        return new ResponseDTO(winners, visualizedCarsMovement);
    }

    private ArrayList<String> getCarNames(String strCarNames) {
        String[] carArray = racingCarLogic.splitCarName(strCarNames);

        return racingCarLogic.arrayToArrayList(carArray);
    }

    private int getTryCount(String strTryCount) {
        return integerParser.parseInteger(strTryCount);
    }

    private Cars getMovedCars(ArrayList<String> carNames, int tryCount) {
        Cars cars = new Cars(carNames);

        return racingCarLogic.loopTryCount(tryCount, cars);
    }

    private String getWinners(Cars cars) {
        List<String> winnerList = cars.getWinner();

        return racingCarLogic.buildListToString(winnerList);
    }
}
