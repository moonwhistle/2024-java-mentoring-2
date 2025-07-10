package com.racing.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputCarName() {
        System.out.print("Input Car Name: ");
        return scanner.nextLine();

    }

    public Integer repetitions() {
        System.out.print("Repetitions: ");
        return scanner.nextInt();
    }

}
