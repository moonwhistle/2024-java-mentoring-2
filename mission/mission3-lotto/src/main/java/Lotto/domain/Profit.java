package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;

import java.util.Arrays;
import java.util.Optional;

public class Profit {

    private static final int match = 1;

    public double calculateProfit(int numberOfLotto){
        int price = calculateWinningPrice(findPrize());

        return (double) price / (numberOfLotto * Lotto.lottoPrice);
    }

    private int calculateWinningPrice(WinningResult winningResult) {
        return winningResult.getPrice();
    }

    private WinningResult findPrize(){
        return Arrays.stream(WinningResult.values())
                .filter(this::getPrize)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(ExceptionMessage.ZERO_MATCH_COUNT.getMessage()));
    }

    private boolean getPrize(WinningResult winningResult){
        return winningResult.getPrizeCount() == match;
    }

}
