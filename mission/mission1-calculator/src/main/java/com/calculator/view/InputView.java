package com.calculator.view;
import java.util.Scanner;

public class InputView {
    Scanner scanner = new Scanner(System.in);

    public int firstNumber(){
        return scanner.nextInt();
    }
    public int secondNumber(){
        return scanner.nextInt();
    }

}
