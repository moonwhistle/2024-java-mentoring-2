package Lotto.domain;

import Lotto.common.displayText.DisplayText;
import Lotto.common.exception.ExceptionMessage;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Winning {

    public String getWinningResult(){
        String resultString = Arrays.stream(WinningResult.values())
                .map(result -> result.getPrizeMessage() + DisplayText.PRIZE_MESSAGE_SEPARATOR.getInputMessage() + result.getPrizeCount())
                .collect(Collectors.joining(DisplayText.NEW_LINE.getInputMessage()));

        return resultString;
    }

    public double calculateProfit(int numberOfLotto, Long matchCount){
        int price = calculatePrice(calculateMatchCount(matchCount)).get();

        return (double) price / (numberOfLotto * Lotto.lottoPrice);
    }

    public void matchWinningResult(Long matchCount){
        for (WinningResult result : WinningResult.values()) {
            result.matchAndIncrement(matchCount);
        }
    }

    public long calculateWinningResult(List<LottoNumber> winningNumber, List<LottoNumber> lottoNumbers){
        return lottoNumbers.stream()
                .filter(lottoNumber -> compareWinningNumber(winningNumber, lottoNumber))
                .count();
    }

    private boolean compareWinningNumber(List<LottoNumber> winningNumber, LottoNumber lottoNumber) {
        return winningNumber.stream()
                .anyMatch(winning -> winning.checkSameWinningNumber(lottoNumber));
    }

    private Optional<WinningResult> calculateMatchCount(Long matchCount){
        validateMatchCount(matchCount);

        return Arrays.stream(WinningResult.values())
                .filter(result -> isMatchCountEqual(result, matchCount))
                .findFirst();
    }

    private Optional<Integer> calculatePrice(Optional<WinningResult> winningResult) {
        return winningResult.map(WinningResult::getPrice);
    }


    private void validateMatchCount(Long matchCount){
        if(matchCount < WinningResult.FOURTH_PRICE.getMatchCount())
            throw new IllegalArgumentException(ExceptionMessage.ZERO_MATCH_COUNT.getMessage());
    }

    private boolean isMatchCountEqual(WinningResult winningResult, Long matchCount){
        return winningResult.getMatchCount() == matchCount;
    }

}
