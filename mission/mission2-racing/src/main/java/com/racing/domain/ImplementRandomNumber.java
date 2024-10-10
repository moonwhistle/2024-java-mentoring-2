package com.racing.domain;

public class ImplementRandomNumber implements GenerateRandom {

    @Override
    public int generateRandomNumber(){
        return random.nextInt(limitNumber);
    }
}
