package com.racing.domain.number;

import com.racing.domain.exception.NegativeRandomNumberException;
import com.racing.domain.exception.OutOfRangeException;

import java.util.Random;

public class GenerateMovingRandomNumber implements RandomNumber {

    private final Random random;

    public GenerateMovingRandomNumber() {
        this.random = new Random();
    }

    @Override
    public int generateRandomNumber(int bound) {
        return random.nextInt(bound+1);
    }

    public int decideMove(int number, int state) {
        if (number >= 4) {
            return state++;
        }
        return state;
    }

    public void validateNegative(int number) {
        if (number < 0) {
            throw new NegativeRandomNumberException();
        }
    }

    public void validateOverBound(int number) {
        if (number > 9) {
            throw new OutOfRangeException();
        }
    }

}
