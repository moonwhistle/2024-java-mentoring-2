package com.racingcar.view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner = new Scanner(System.in);

    public String getInput(){
        return scanner.next();
    }
}
