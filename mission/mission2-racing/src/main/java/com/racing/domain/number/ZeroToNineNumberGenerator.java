package com.racing.domain.number;

import com.racing.domain.exception.NegativeNumberException;
import com.racing.domain.exception.OutOfRangeException;

import java.util.Random;

public class ZeroToNineNumberGenerator implements RandomNumber {

    private final Random random;

    public ZeroToNineNumberGenerator() {
        this.random = new Random();
    }

    public int generateRandomNumber() {
        int randomNumber = random.nextInt(9) + 1;
        validateIsNotNegative(randomNumber);
        validateIsInRange(randomNumber);
        return randomNumber;
    }

    private void validateIsNotNegative(int number) {
        if (number < 0) {
            throw new NegativeNumberException();
        }
    }

    private void validateIsInRange(int number) {
        if (number > 9) {
            throw new OutOfRangeException();
        }
    }
}
