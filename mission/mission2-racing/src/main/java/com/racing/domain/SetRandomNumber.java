package com.racing.domain;

import java.util.Random;

public class SetRandomNumber implements RandomGeneration {
    private final int setRandomNumber;
    private static final Random random = new Random();

    public SetRandomNumber(int setRandomNumber) {
        this.setRandomNumber = setRandomNumber;
    }

    @Override
    public int generateRandomNumber(int bound) {
        return random.nextInt(bound + 1);
    }
}
