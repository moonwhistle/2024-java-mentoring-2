package com.racing.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);
    private final int limitNumber = 6;
    private final String splitString = ",";
    private final int startNum = 0;

    public String input(){
        return scanner.next();
    }

    public int IntegerInput(){
        return scanner.nextInt();
    }

    public List<String> inputName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = scanner.next();
        String[] inputs = input.split(splitString);

        return List.of(inputs);
    }

    public int integerInput(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = scanner.next();
        int intInput;
        try {
            intInput = Integer.parseInt(input);
        }
        catch(IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }

        return intInput;
    }

}
