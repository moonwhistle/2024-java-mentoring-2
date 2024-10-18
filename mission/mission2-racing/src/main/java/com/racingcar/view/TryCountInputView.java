package com.racingcar.view;

import java.util.Scanner;

public class TryCountInputView {
    private final Scanner scanner = new Scanner(System.in);

    public String getTryCountInput(){
        System.out.println("시도할 회수는 몇회인가요?");
        return scanner.next();
    }
}
