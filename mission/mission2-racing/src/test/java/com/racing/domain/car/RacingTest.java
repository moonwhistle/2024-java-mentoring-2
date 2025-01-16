package com.racing.domain.car;

import com.racing.service.Ranking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RacingTest {

    Ranking ranking;

    @BeforeEach
    void setUp() {
        ranking = new Ranking();
    }

    @Test
    void 우승자구하기테스트() {

        //given
        Car neo = new Car("neo");
        Car brie = new Car("brie");
        List<Car> registeredCars = Arrays.asList(neo, brie);
        neo.driveCar(9);
        brie.driveCar(0);
        String expected = "neo";
        String notExpected = "brie";

        //when & then
        String result = ranking.findWinner(registeredCars);
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }
}
