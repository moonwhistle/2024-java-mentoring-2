package view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public int firstNumber() {
        System.out.println("첫번째 숫자를 입력하세요");
        return scanner.nextInt();
    }

    public int secondNumber() {
        System.out.print("두번째 숫자를 입력하세요");
        return scanner.nextInt();
    }

}