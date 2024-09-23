package com.calculator.view;

import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);

    public int firstNumber() {
        System.out.println("Enter first number: ");
        return sc.nextInt();
    }

    public int secondNumber() {
        System.out.println("Enter second number: ");
        return sc.nextInt();
    }
}