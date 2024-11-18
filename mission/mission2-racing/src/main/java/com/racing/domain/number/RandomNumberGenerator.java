package com.racing.domain.number;

import com.racing.common.exception.NegativeRandomNumberException;
import com.racing.common.exception.OutOfRangeException;

import java.util.Random;

public class RandomNumberGenerator implements RandomNumber {

    private final Random random;

    public RandomNumberGenerator() {
        this.random = new Random();
    }

    @Override
    public int generateRandomNumber() {
        int number = random.nextInt(10);
        validateNegative(number);
        validateOverBound(number);
        return number;
    }

    private void validateNegative(int number) {
        if (number < 0) {
            throw new NegativeRandomNumberException();
        }
    }

    private void validateOverBound(int number) {
        if (number > 9) {
            throw new OutOfRangeException();
        }
    }
}
