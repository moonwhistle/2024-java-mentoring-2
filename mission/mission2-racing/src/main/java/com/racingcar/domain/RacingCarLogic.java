package com.racingcar.domain;

import com.racingcar.util.random.RandomNumberGenerator;
import com.racingcar.util.random.ZeroToNineGenerator;

public class RacingCarLogic {

    public int getZeroToNineRandomNumber(){
        RandomNumberGenerator zeroToNineGenerator = new ZeroToNineGenerator();

        return zeroToNineGenerator.getRandomNumber();
    }
}
