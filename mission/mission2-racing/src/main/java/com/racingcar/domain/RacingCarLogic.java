package com.racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCarLogic {

    private final String JOIN_STRING = ", ";

    public String[] splitCarName(String carName){
        return carName.split(",");
    }

    public Cars loopTryCount(int tryCount, Cars cars){
        for(int i = 0; i < tryCount; i++){
            cars.moveCars();
        }

        return cars;
    }

    public String buildWinnerString(List<String> winnerList){
        return String.join(JOIN_STRING, winnerList);
    }

    public ArrayList<String> arrayToArrayList(String [] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
