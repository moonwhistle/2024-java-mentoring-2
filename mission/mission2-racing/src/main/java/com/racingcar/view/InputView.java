package com.racingcar.view;

import java.util.Scanner;

public class InputView {

    private final Scanner inputCar = new Scanner(System.in);

    public String carName() {
        System.out.println("자동차 이름을 입력하세요.");
        return inputCar.next();
    }

}
