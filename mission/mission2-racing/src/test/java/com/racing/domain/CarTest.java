package com.racing.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CarTest {

    @Test
    void 차이름반환테스트() {

        //given
        String carName = "Daytona";
        Car car = new Car();
        String expected = "Daytona";

        //when
        String result = car.showCarName(carName);

        //then
        Assertions.assertEquals(expected, result);
    }
}
