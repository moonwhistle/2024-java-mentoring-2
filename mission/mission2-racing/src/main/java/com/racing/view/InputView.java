package com.racing.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public String receiveCarName() {
        System.out.println("차의 이름을 입력하세요.");
        return scanner.next();
    }

    public int receiveNumberOfLaps() {
        System.out.println("레이싱 랩 수를 입력하세요.");
        return scanner.nextInt();
    }
}
