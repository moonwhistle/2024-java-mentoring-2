package com.calculator.view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int firstNumber() {
        return scanner.nextInt();
    }

    public int secondNumber() {
        return scanner.nextInt();
    }
}