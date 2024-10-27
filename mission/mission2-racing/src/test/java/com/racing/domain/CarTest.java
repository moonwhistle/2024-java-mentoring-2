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
        car = new Car();
    }

    @Test
    void 차이름반환테스트() {

        //given
        String carName = "Daytona";
        String expected = "Daytona";

        //when
        String result = car.showCarName(carName);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void 차이름배열저장테스트() {

        //given
        String carName = "Daytona";
        List<String> carInformation = new ArrayList<>();
        carInformation.add(carName);
        String[] expected = carInformation.toArray(new String[carInformation.size()]);

        //when
        List<String> saving = car.saveCar(carName);
        String[] result = saving.toArray(new String[saving.size()]);

        //then
        Assertions.assertArrayEquals(expected, result);
    }
}


