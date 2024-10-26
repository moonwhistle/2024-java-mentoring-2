package com.racing.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public String carName() {
        System.out.print("차의 이름을 입력하세요");
        return scanner.next();
    }
}
