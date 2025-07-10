package com.racing.domain.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputCarName(){
        System.out.println("CarName: ");
        return scanner.next();
    }
}
