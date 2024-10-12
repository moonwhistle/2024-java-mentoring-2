package com.racing.domain;

public class RandomNumbers implements GenerateRandom {

    @Override
    public int generateRandomNumber(){
        return random.nextInt(limitNumber);
    }

}
