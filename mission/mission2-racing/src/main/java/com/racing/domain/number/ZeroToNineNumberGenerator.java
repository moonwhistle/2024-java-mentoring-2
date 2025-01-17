package com.racing.domain.number;

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
            throw new IllegalArgumentException("범위 밖의 음수가 생성되었습니다.");
        }
    }

    private void validateIsInRange(int number) {
        if (number > 9) {
            throw new IllegalArgumentException("범위 밖의 수가 생성되었습니다.");
        }
    }
}
