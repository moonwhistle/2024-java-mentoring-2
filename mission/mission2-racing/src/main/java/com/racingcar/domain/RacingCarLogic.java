package com.racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;

public class RacingCarLogic {
    public String[] splitCarName(String carName){
        return carName.split(",");
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
