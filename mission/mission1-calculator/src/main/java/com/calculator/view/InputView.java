package com.calculator.view;

import java.util.Scanner;

public class InputView {

    private final Scanner s = new Scanner(System.in);

    public String input(){
        return s.next();
    }
}
