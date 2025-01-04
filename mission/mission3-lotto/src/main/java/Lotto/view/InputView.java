package Lotto.view;

import Lotto.common.displayText.DisplayText;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public int purchaseLotto(){
        System.out.println(DisplayText.ENTER_PURCHASE_AMOUNT.getInputMessage());
        return scanner.nextInt();
    }

}
