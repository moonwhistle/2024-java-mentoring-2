package com.lotto.domain.number;

import java.util.Random;

public class LottoNumberGenerator {

    private static final int FIRST_LOTTERY_NUMBER = 1;
    private static final int LAST_LOTTERY_NUMBER = 45;
    private static final int NUMBER_OF_LOTTO_NUMBERS = 6;

    private final Random random;

    public LottoNumberGenerator() {
        this.random = new Random();
    }

    private int generateRandomNumber() {
        return random.nextInt(LAST_LOTTERY_NUMBER) + FIRST_LOTTERY_NUMBER;
    }
}
