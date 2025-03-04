package Lotto.view;

import Lotto.common.displayText.DisplayText;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);

    public int purchaseLotto(){
        System.out.println(DisplayText.ENTER_PURCHASE_AMOUNT.getInputMessage());
        return scanner.nextInt();
    }

    public String enterWinningNumber(){
        System.out.println(DisplayText.ENTER_WINNING_NUMBER.getInputMessage());
        scanner.nextLine();
        return scanner.nextLine();
    }

    public String enterBonusNumber(){
        System.out.println();
        System.out.println(DisplayText.ENTER_BONUS_NUMBER.getInputMessage());
        return scanner.nextLine();
    }

    public int enterManualLottoNumber(){
        System.out.println();
        System.out.println(DisplayText.ENTER_MANUAL_LOTTO_NUMBER.getInputMessage());
        return scanner.nextInt();
    }

    public List<String> enterManualLotto(int manualLottoNumber){
        System.out.println();
        System.out.println(DisplayText.ENTER_MANUAL_LOTTO.getInputMessage());

        return IntStream.range(0, manualLottoNumber)
                .mapToObj(i -> {
                    return scanner.next();
                })
                .collect(Collectors.toList());
    }

}
