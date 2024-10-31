package com.racingcar.domain;

import com.racingcar.util.random.RandomNumberGenerator;
import com.racingcar.util.random.ZeroToNineGenerator;

public class RacingCarLogic {

    public int getZeroToNineRandomNumber(){
        RandomNumberGenerator zeroToNineGenerator = new ZeroToNineGenerator();

        return zeroToNineGenerator.getRandomNumber();
    }

    public int isCarMoved(int randomNumber){
        if(randomNumber >= 4){
            return 1;
        }

        return 0;
    }

    public int processCarMove(){
        int randomNumber = getZeroToNineRandomNumber();

        return isCarMoved(randomNumber);
    }
}
