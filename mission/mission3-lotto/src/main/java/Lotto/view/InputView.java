package Lotto.view;

import Lotto.common.displayText.DisplayText;
import Lotto.common.exception.ExceptionMessage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final String splitBy = ",";
    private static final int validNumberOfLotto = 6;
    private final Scanner scanner = new Scanner(System.in);

    public int purchaseLotto(){
        System.out.println(DisplayText.ENTER_PURCHASE_AMOUNT.getInputMessage());
        return scanner.nextInt();
    }

    public List<Integer> enterWinningNumber(){
        System.out.println(DisplayText.ENTER_WINNING_NUMBER.getInputMessage());
        scanner.nextLine();
        String winningNumber = scanner.nextLine();
        List<Integer> winning = Arrays.stream(winningNumber.split(splitBy))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        if(winning.size() != validNumberOfLotto)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_WINNING_RESULT.getMessage());

        return winning;
    }

}
