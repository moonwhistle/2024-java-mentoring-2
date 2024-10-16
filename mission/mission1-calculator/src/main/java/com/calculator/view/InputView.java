package com.calculator.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public int firstOperand() {
        System.out.println("첫번째 연산자를 입력하세요.");
        return scanner.nextInt();
    }

    public int secondOperand() {
        System.out.println("두번째 연산자를 입력하세요.");
        return scanner.nextInt();
    }

    public String messageOperand() {
        System.out.println("연산자를 입력하세요.");
        return scanner.next();
    }
}
