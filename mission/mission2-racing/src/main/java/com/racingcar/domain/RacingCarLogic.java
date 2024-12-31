package com.racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class RacingCarLogic {
    private final String CAR_NAME_SPLIT_PATTERN = ",";

    public String[] splitCarName(String carName){
        return carName.split(CAR_NAME_SPLIT_PATTERN);
    }

    public Cars loopTryCount(int tryCount, Cars cars){
        for(int i = 0; i < tryCount; i++){
            cars.moveCars();
        }

        return cars;
    }

    public ArrayList<String> arrayToArrayList(String [] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
