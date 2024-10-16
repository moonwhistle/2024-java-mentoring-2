package com.calculator.view;
import java.util.Scanner;

public class InputView {

    private final Scanner inputSeparatorNumber = new Scanner(System.in);

    public String inputSeparator() {
        System.out.println("더할 숫자를 입력해주세요.(구분자는 ','와 ';'입니다. 추가를 하고싶다면 '//'와 '\\n'사이에 구분자를 입력해주세요: ");
        return inputSeparatorNumber.next();
    }

}
