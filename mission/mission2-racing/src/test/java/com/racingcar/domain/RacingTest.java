package com.racingcar.domain;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class RacingTest {

    @Test
    void 랜덤변수확인_테스트() {

        //given

        //when
        Racing racing = new Racing();
        int result = racing.randomValue();

        //then
        assertNotNull(result);
    }

    @Test
    public void 차가_가는지_확인() {

        //given
        int number = new Random().nextInt(10);
        int go = 1;
        int stop = 0;

        //when
        Racing racing = new Racing();
        int result = racing.count(number);

        //then
        Assertions.assertAll(
                () -> assertEquals(go, result),
                () -> assertNotEquals(stop, result)
        );
    }
  
}
