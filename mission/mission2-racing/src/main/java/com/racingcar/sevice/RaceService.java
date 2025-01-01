package com.racingcar.sevice;

import com.racingcar.controller.dto.RequestDTO;
import com.racingcar.controller.dto.ResponseDTO;

import com.racingcar.domain.Cars;
import com.racingcar.domain.IntegerParser;
import com.racingcar.domain.RacingCarLogic;

import java.util.ArrayList;
import java.util.List;

public class RaceService {
    private final RacingCarLogic racingCarLogic;
    private final IntegerParser integerParser;

    public RaceService() {
        this.racingCarLogic = new RacingCarLogic();
        this.integerParser = new IntegerParser();
    }

    public ArrayList<String> getCarNames(String strCarNames) {
        String[] carArray = racingCarLogic.splitCarName(strCarNames);

        return racingCarLogic.arrayToArrayList(carArray);
    }

    public int getTryCount(String strTryCount) {
        return integerParser.parseInteger(strTryCount);
    }

    public Cars getMovedCars(ArrayList<String> carNames, int tryCount){
        Cars cars = new Cars(carNames);
        return racingCarLogic.loopTryCount(tryCount, cars);
    }

    public ResponseDTO raceCar(RequestDTO inputViewRequestDTO) {
        ArrayList<String> carNames = getCarNames(inputViewRequestDTO.carNames());
        int tryCount = getTryCount(inputViewRequestDTO.tryCount());

        Cars movedCars = getMovedCars(carNames, tryCount);

        List<String> winnerList = movedCars.getWinner();
        String winners = racingCarLogic.buildListToString(winnerList);
        return new ResponseDTO(winners);
    }
}
