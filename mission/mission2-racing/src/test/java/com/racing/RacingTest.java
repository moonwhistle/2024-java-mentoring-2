package com.racing;

import com.racing.domain.car.Car;
import com.racing.domain.car.CarName;
import com.racing.domain.car.Ranking;
import com.racing.domain.car.Registration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RacingTest {

    @Test
    void 우승자구하기테스트() {

        //given
        CarName neo = new CarName("neo");
        CarName brie = new CarName("brie");
        Car neoCar = new Car(neo);
        Car brieCar = new Car(brie);
        List<Car> cars = Arrays.asList(neoCar, brieCar);
        neoCar.moveForwardOrStop(5);
        brieCar.moveForwardOrStop(0);
        String expected = "neo";
        String notExpected = "brie";
        Ranking ranking = new Ranking();

        //when & then
        String result = ranking.findWinner(cars);
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }

    @Test
    void 위치초기화테스트() {

        //given
        CarName neo = new CarName("neo");
        Car neoCar = new Car(neo);
        String expected = "-";
        String notExpected = "";

        //when & then
        String result = neoCar.getCarPosition();
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }
}
