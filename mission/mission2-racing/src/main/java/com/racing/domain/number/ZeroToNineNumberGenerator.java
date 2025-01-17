package com.racing.domain.number;

import java.util.Random;

public class ZeroToNineNumberGenerator implements RandomNumber {

    private final Random random;

    public ZeroToNineNumberGenerator() {
        this.random = new Random();
    }

    public int generateRandomNumber() {
        int randomNumber = random.nextInt(9) + 1;
        return randomNumber;
    }
}
