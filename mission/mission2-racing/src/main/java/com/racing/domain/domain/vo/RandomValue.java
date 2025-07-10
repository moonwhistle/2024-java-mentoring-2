package com.racing.domain.domain.vo;

import java.util.Random;

public class RandomValue implements RandomNumber {

    private final int MAX_RANDOM_VAL = 10;
    private final int value;

    public RandomValue(Random random) {
        this.value = random.nextInt(MAX_RANDOM_VAL);
    }

    @Override
    public int randomValue() {
        return value;
    }
}
