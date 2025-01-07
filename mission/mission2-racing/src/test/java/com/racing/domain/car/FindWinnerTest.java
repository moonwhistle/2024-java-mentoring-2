package com.racing.domain.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindWinnerTest {

    @Test
    void 우승자구하기테스트() {

        //given
        int maxPosition = 2;
        int notMaxPosition = 1;
        Car neo = new Car("neo");
        Car brie = new Car("brie");
        List<Car> registeredCars = Arrays.asList(neo, brie);
        neo.driveCar(5);
        brie.driveCar(2);
        Racing racingCars = new Racing();
        String expected = "neo";
        String notExpected = "brie";

        //when & then
        String result = racingCars.findWinner(registeredCars,maxPosition);
        String notResult = racingCars.findWinner(registeredCars,notMaxPosition);
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertEquals(notExpected, notResult),
                () -> Assertions.assertNotEquals(expected, notResult),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }
}
