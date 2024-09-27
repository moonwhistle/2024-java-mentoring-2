package com.calculator.view;
import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public int firstNumber(){
        System.out.print("첫 번째 숫자를 입력하세요: ");
        return scanner.nextInt();
    }

    public int secondNumber(){
        System.out.print("두 번째 숫자를 입력하세요: ");
        return scanner.nextInt();
    }

}

