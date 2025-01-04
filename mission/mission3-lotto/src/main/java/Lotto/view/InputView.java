package Lotto.view;

import Lotto.common.displayText.DisplayText;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final String splitBy = ",";
    private final Scanner scanner = new Scanner(System.in);

    public int purchaseLotto(){
        System.out.println(DisplayText.ENTER_PURCHASE_AMOUNT.getInputMessage());
        return scanner.nextInt();
    }

    public List<Integer> enterWinningNumber(){
        System.out.println(DisplayText.ENTER_WINNING_NUMBER.getInputMessage());
        String winningNumber = scanner.nextLine();
        return Arrays.stream(winningNumber.split(splitBy))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

}
