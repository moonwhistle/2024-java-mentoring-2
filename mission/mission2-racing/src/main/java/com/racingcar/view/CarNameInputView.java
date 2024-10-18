package com.racingcar.view;

import java.util.Scanner;

public class CarNameInputView {

    private final Scanner scanner = new Scanner(System.in);

    public String getCarNameInput(){
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return scanner.next();
    }
}
