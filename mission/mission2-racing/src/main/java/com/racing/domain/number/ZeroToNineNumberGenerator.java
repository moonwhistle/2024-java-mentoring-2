package com.racing.domain.number;

import com.racing.domain.exception.NegativeNumberException;
import com.racing.domain.exception.OutOfRangeException;

import java.util.Random;

public class ZeroToNineNumberGenerator implements RandomNumber {

    private static final int NUM_ZERO = 0;
    private static final int MAXIMUM_OF_RANDOM_NUMBER = 9;
    private static final int RANGE_OF_RANDOM_NUMBER = 10;
    private final Random random;

    public ZeroToNineNumberGenerator() {
        this.random = new Random();
    }

    public int generateRandomNumber() {
        int randomNumber = random.nextInt(RANGE_OF_RANDOM_NUMBER);
        validateIsNotNegative(randomNumber);
        validateIsInRange(randomNumber);
        return randomNumber;
    }

    private void validateIsNotNegative(int number) {
        if (number < NUM_ZERO) {
            throw new NegativeNumberException();
        }
    }

    private void validateIsInRange(int number) {
        if (number > MAXIMUM_OF_RANDOM_NUMBER) {
            throw new OutOfRangeException();
        }
    }
}
