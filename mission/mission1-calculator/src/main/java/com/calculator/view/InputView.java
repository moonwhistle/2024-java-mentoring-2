package com.calculator.view;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public int firstNumber(){
        System.out.print("Enter first number: ");
        return scanner.nextInt();
    }

    public int secondNumber(){
        while (true) {
            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();
            if (secondNumber != 0) {
                scanner.nextLine();
                return secondNumber;
            }
        }

    }

}