package Lotto.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);
    private final int lottoPrice = 1000;
    private final String enterAmount = "구입금액을 입력해 주세요.";

    public int purchaseLotto(){
        System.out.println(enterAmount);
        int amount = scanner.nextInt();
        return amount / lottoPrice;
    }

}
