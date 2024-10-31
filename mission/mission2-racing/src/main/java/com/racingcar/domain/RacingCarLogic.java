package com.racingcar.domain;

import com.racingcar.util.random.RandomNumberGenerator;
import com.racingcar.util.random.ZeroToNineGenerator;

public class RacingCarLogic {

    public int getZeroToNineRandomNumber(){
        RandomNumberGenerator zeroToNineGenerator = new ZeroToNineGenerator();

        return zeroToNineGenerator.getRandomNumber();
    }

    public String isCarMoved(){
        int randomNumber = getZeroToNineRandomNumber();

        if(randomNumber >=  4){
            return "move";
        }

        return "stop";
    }
}
