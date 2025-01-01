package com.racingcar.domain;

public class ZeroToNineGenerator implements RandomNumberGenerator {
    @Override
    public int getRandomNumber(){
        return (int) (Math.random() * 10);
    }
}
