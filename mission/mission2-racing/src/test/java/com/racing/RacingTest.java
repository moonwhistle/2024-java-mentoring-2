package com.racing;

import com.racing.domain.car.Car;
import com.racing.domain.car.Ranking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.List;

public class RacingTest {

    @Test
    void 우승자구하기테스트() {

        //given
        Ranking ranking = new Ranking();
        LinkedHashMap<String, String> progressOfLaps = new LinkedHashMap<>();
        progressOfLaps.put("neo","--");
        progressOfLaps.put("brie","-");
        int maxPosition = 2;
        List<String> expected = List.of("neo");
        List<String> notExpected = List.of("brie");

        //when & then
        List<String> result = ranking.findNameOfWinner(progressOfLaps, maxPosition);
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }

    @Test
    void 위치초기화테스트() {

        //given
        Car neo = new Car("neo");
        String expected = "-";
        String notExpected = "";

        //when & then
        String result = neo.getCarPosition();
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }

    @Test
    void 전진및멈춤테스트() {

        //given
        Car neo = new Car("neo");
        neo.moveForwardOrStop(5);
        neo.moveForwardOrStop(0);
        String expected = "--";
        String notExpected = "-";

        //when & then
        String result = neo.getCarPosition();
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertNotEquals(notExpected, result)
        );
    }

    @Test
    void 이름반환테스트() {

        //given
        Car neo = new Car("neo");
        Car brie = new Car("brie");
        String expected = "neo";
        String expected2 = "brie";

        //when & then
        String result = neo.getCarName();
        String result2 = brie.getCarName();
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected, result),
                () -> Assertions.assertEquals(expected2, result2),
                () -> Assertions.assertNotEquals(expected, result2),
                () -> Assertions.assertNotEquals(expected2, result)
        );
    }
}
