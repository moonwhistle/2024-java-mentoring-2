package com.lotto.domain.number;

import com.lotto.exception.OutOfRangeException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoNumberGenerator implements RandomNumberGenerator {

    private static final int FIRST_LOTTERY_NUMBER = 1;
    private static final int LAST_LOTTERY_NUMBER = 45;
    private static final int NUMBER_OF_LOTTO_NUMBERS = 6;

    private final Random random;

    public LottoNumberGenerator() {
        this.random = new Random();
    }

    @Override
    public List<Integer> generateRandomNumbers() {
        List<Integer> lotteryNumbers = new ArrayList<>();
        while(lotteryNumbers.size() < NUMBER_OF_LOTTO_NUMBERS) {
            int lotteryNumber = generateRandomNumber();
            validateIsValidNumber(lotteryNumber);
            pickWithOutDuplication(lotteryNumbers, lotteryNumber);
        }
        return lotteryNumbers;
    }

    private int generateRandomNumber() {
        return random.nextInt(LAST_LOTTERY_NUMBER) + FIRST_LOTTERY_NUMBER;
    }

    private void validateIsValidNumber(int number) {
        if (number < FIRST_LOTTERY_NUMBER || number > LAST_LOTTERY_NUMBER) {
            throw new OutOfRangeException();
        }
    }

    private void pickWithOutDuplication(List<Integer> lotteryNumbers, int number) {
        if(!lotteryNumbers.contains(number)) {
            lotteryNumbers.add(number);
        }
    }
}
