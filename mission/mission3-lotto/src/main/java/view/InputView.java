package view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);
    private static final int lottoPrice = 1000;

    public int purchaseLotto(int amount){
        return amount / lottoPrice;
    }

}
