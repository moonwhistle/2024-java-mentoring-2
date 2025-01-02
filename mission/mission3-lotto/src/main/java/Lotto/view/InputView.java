package Lotto.view;

import Lotto.domain.Lotto;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);
    private final String enterAmount = "구입금액을 입력해 주세요.";

    public int purchaseLotto(){
        System.out.println(enterAmount);
        int inputPrice = scanner.nextInt();
        validPrice(inputPrice);
        return inputPrice;
    }

    private void validPrice(int inputPrice){
        if(inputPrice < Lotto.lottoPrice)
            throw new IllegalArgumentException("최소 구입 금액은 1000원입니다.");
    }

}
