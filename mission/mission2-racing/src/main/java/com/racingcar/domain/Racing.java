package com.racingcar.domain;

import java.util.Random;

public class Racing {

    private final Random rand = new Random();

    public int count(int number) {
        int moveCount = 0;
        if (number >= 4) {
            moveCount++;
        }
        return moveCount;
    }

    public int randomValue() {
        return rand.nextInt(10);
    }

}
