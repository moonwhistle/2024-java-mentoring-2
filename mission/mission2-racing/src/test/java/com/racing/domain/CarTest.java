package com.racing.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(new SetRandomNumber(5));
    }

    @Test
    void 차이름배열저장테스트() {

        //given
        String carName = "Daytona";
        List<String> carInformation = new ArrayList<>();
        carInformation.add(carName);
        List<String> expected = carInformation;

        //when
        List<String> result = car.saveCar(carName);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void 차움직임테스트() {

        //given
        List<String> carInformation = new ArrayList<>();
        carInformation.add("Daytona");
        List<String> carExpected = carInformation;
        carExpected.add("-");
        List<String> expected = carExpected;

        //when
        List<String> result = car.forwardOrStop(carInformation);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void 차멈춤테스트() {

        //given
        car = new Car(new SetRandomNumber(2));
        List<String> carInformation = new ArrayList<>();
        carInformation.add("Daytona");
        List<String> expected = carInformation;

        //when
        List<String> result = car.forwardOrStop(carInformation);

        //then
        Assertions.assertEquals(expected, result);
    }
}
