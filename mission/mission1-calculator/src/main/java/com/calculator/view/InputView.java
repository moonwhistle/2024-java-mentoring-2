package com.calculator.view;

import java.util.Scanner;

public class InputView {

    private final Scanner sc = new Scanner(System.in);

    public int firstOperand() {
        System.out.println("첫번째 연산자를 입력하세요.");
        return sc.nextInt();
    }

    public int secondOperand() {
        System.out.println("두번째 연산자를 입력하세요.");
        int secondOperand = sc.nextInt();
        if (secondOperand == 0) throw new ArithmeticException("0으로 나뉘지 않습니다.");
        return sc.nextInt();
    }
}
