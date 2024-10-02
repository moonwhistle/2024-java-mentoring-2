package com.calculator.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public int firstNumber(){
        System.out.print("첫번째 숫자를 입력하시오: ");
        return scanner.nextInt();
    }

    public int secondNumber(){
        while (true) {
            System.out.print("두번째 숫자를 입력하시오(0제외): ");
            int secondNumber = scanner.nextInt();
            if (secondNumber != 0) {
                scanner.nextLine();
                return secondNumber;
            }
        }
    }

}
