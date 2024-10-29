package com.racing.domain;

import java.util.Random;

public class RandomNumber implements RandomGeneration {

    private static final Random random = new Random();

    @Override
    public int generateRandomNumber(int bound) {
        return random.nextInt(bound+1);
    }
}
