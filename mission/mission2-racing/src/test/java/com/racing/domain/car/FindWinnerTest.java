package com.racing.domain.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FindWinnerTest {

    @Test
    void 우승자구하기테스트() {

        //given
        int maxPosition = 1;
        int notMaxPosition = 0;
        Car neo = new Car("neo");
        Car brie = new Car("brie");
        List<Car> registeredCars = Arrays.asList(neo, brie);
        neo.driveCar(5);
        brie.driveCar(2);
        Cars recingCars = new Cars(registeredCars);
        List<String> expected = Arrays.asList(("neo"));
        List<String> notExpected = Arrays.asList(("brie"));

        //when & then
        List<String> result = recingCars.findWinner(maxPosition);
        List<String> notResult = recingCars.findWinner(notMaxPosition);
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertEquals(notExpected, notResult),
                () -> Assertions.assertNotEquals(expected, notResult),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }
}
