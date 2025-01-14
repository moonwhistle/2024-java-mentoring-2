package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Winning {

    public String getWinningResult(){
        String resultString = Arrays.stream(WinningResult.values())
                .map(result -> result.getPrizeMessage() + "- " + result.getPrizeCount())
                .collect(Collectors.joining("\n"));

        return resultString;
    }

    public double calculateProfit(Lottos lottos, Long matchCount){
        int price = matchPriceAndMatchCount(matchCount);

        return (double) price / (lottos.getNumberOfLottos() * Lotto.lottoPrice);
    }

    public void matchWinningResult(Long matchCount){
        if(matchCount == WinningResult.FIRST_PRICE.getMatchCount())
            WinningResult.FIRST_PRICE.incrementPrizeCount();
        if(matchCount == WinningResult.SECOND_PRICE.getMatchCount())
            WinningResult.SECOND_PRICE.incrementPrizeCount();
        if(matchCount == WinningResult.THIRD_PRICE.getMatchCount())
            WinningResult.THIRD_PRICE.incrementPrizeCount();
        if(matchCount == WinningResult.FOURTH_PRICE.getMatchCount())
            WinningResult.FOURTH_PRICE.incrementPrizeCount();
    }

    public long calculateWinningResult(Lottos lottos, List<LottoNumber> winningNumber){
        return lottos.getLottos().stream()
                .mapToLong(lotto -> compareLottoAndWinningNumber(lotto, winningNumber))
                .max()
                .orElse(0);
    }

    private long compareLottoAndWinningNumber(Lotto lotto, List<LottoNumber> winningNumber) {
        return lotto.getLotto().stream()
                .filter(lottoNumber -> winningNumber.stream().anyMatch(winning -> lottoNumber.checkSameWinningNumber(winning)))
                .count();
    }

    private int matchPriceAndMatchCount(Long matchCount){
        validateMatchCount(matchCount);

        return Arrays.stream(WinningResult.values())
                .filter(result -> isMatchCountEqual(result, matchCount))
                .map(WinningResult::getPrice)
                .findFirst()
                .orElse(0);
    }

    private void validateMatchCount(Long matchCount){
        if(matchCount < WinningResult.FOURTH_PRICE.getMatchCount())
            throw new IllegalArgumentException(ExceptionMessage.ZERO_MATCH_COUNT.getMessage());
    }

    private boolean isMatchCountEqual(WinningResult winningResult, Long matchCount){
        return winningResult.getMatchCount() == matchCount;
    }

}
