package com.calculator.view;

import java.util.Scanner;

public class InputView {

    public int firstNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        return scanner.nextInt();
    }

    public int secondNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
