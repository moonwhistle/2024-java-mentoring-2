package com.racing.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);
    private final int limitNumber = 6;
    private final int startNum = 0;

    public String input(){
        return scanner.next();
    }

    public String inputName(){
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = scanner.next();

        return input;
    }

    public int integerInput(){
        System.out.println("시도할 횟수는 몇 회인가요?");
        try{
            int input = scanner.nextInt();
            return input;
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException("정수 형태를 입력해야합니다.");
        }
    }

}
