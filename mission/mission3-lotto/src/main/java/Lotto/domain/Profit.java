package Lotto.domain;

import java.util.Arrays;
import java.util.Optional;

public class Profit {

    private static final int match = 1;

    public double calculateProfit(int numberOfLotto){
        int price = calculateWinningPrice(findPrize()).get();

        return (double) price / (numberOfLotto * Lotto.lottoPrice);
    }

    private Optional<Integer> calculateWinningPrice(Optional<WinningResult> winningResult) {
        return winningResult.map(WinningResult::getPrice);
    }

    private Optional<WinningResult> findPrize(){

        return Arrays.stream(WinningResult.values())
                .filter(this::getPrize)
                .findFirst();
    }

    private boolean getPrize(WinningResult winningResult){
        return winningResult.getPrizeCount() == match;
    }

}
