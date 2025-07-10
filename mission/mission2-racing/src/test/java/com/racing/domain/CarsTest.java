package com.racing.domain;

import com.racing.domain.Car.Car;
import com.racing.domain.Car.Cars;
import com.racing.domain.vo.RandomValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class CarsTest {

    Random random = new Random();
    List<Car> carList = new ArrayList<>();
    RandomValue randomValue = new RandomValue(random);
    Cars cars = new Cars(carList, randomValue);


    @Test
    void carNameSharingTest() {

        String name = "jihoo, hoo, gui, seungbong";

        String[] test = cars.carNameSharing(name);
        String[] expect = {"jihoo", "hoo", "gui", "seungbong"};

        assert Arrays.equals(test, expect);

        for (String s : test) {
            System.out.println(s);
        }
    }

    @Test
    void addListCarNameTest() {
        String[] carName = {"jihoo", "hoo", "gui", "seung"};

        cars.addListCarName(carName); // 실제 로직 수행

        // 실제 리스트의 carName만 추출
        List<String> actualNames = carList.stream()
                .map(Car::getCarName)
                .collect(Collectors.toList());

        List<String> expectedNames = Arrays.asList("jihoo", "hoo", "gui", "seung");

        Assertions.assertEquals(expectedNames, actualNames);
    }

    @Test
    void whichCarMoveTest() {
        String[] carName = {"jihoo", "hoo", "gui", "seung"};

        cars.addListCarName(carName);
        cars.whichCarMove();
    }
}
