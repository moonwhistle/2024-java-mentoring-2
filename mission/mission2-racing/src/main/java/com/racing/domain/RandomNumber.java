package com.racing.domain;

import java.util.Random;

public interface RandomNumber {

    int LimitNumber = 10;
    int moveFront = 1;
    int notMove = 0;
    int bound = 4;
    public static Random random = new Random();

    default int generateRandomNumber(){
        return random.nextInt(LimitNumber);
    }

    default int checkMove(int random){
        return validateRandomNumbers(random);
    }

    default int validateRandomNumbers(final int random){
        if(random >= bound)
            return moveFront;
        return notMove;
    }
}
