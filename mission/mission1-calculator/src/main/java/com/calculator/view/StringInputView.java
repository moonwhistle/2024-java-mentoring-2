package com.calculator.view;

import java.util.Scanner;

public class StringInputView {

    private final Scanner stringScanner = new Scanner(System.in);

    public String stringOperand() {
        System.out.println("문자열을 입력하세요.");
        return stringScanner.nextLine();
    }
}
