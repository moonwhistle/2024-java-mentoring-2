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

    public ResponseDTO raceCar(RequestDTO inputViewRequestDTO) {
        ArrayList<String> carNames = getCarNames(inputViewRequestDTO.getCarNames());
        int tryCount = getTryCount(inputViewRequestDTO.getTryCount());

        Cars cars = new Cars(carNames);
        Cars movedCars = racingCarLogic.loopTryCount(tryCount, cars);

        List<String> winnerList = movedCars.getWinner();
        return new ResponseDTO(winnerList);
    }
}
