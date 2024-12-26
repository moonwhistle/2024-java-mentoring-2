package com.racing.domain.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RandomNumberGeneratorTest {

    private RandomNumberGenerator randomNumberGenerator;

    @BeforeEach
    void setUp() {
        randomNumberGenerator = new RandomNumberGenerator();
    }

    @Test
    void 랜덤생성테스트() {

        //given
        int number = randomNumberGenerator.generateRandomNumber();
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numberList2 = Arrays.asList(10, 0, 11, 12);

        //when
        boolean result = numberList.contains(number);
        boolean notResult = numberList2.contains(number);
        boolean expect = true;

        //then
        Assertions.assertAll(
                () -> Assertions.assertEquals(result, expect),
                () -> Assertions.assertNotEquals(notResult, expect)
        );
    }
}
