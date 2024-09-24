package com.calculator.view;
import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public int inputFirst_number(){
        System.out.print("Enter first number: ");
        return sc.nextInt();
    }
    public int inputSecond_number(){
        System.out.print("Enter second number: ");
        return sc.nextInt();
    }
}