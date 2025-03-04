package Lotto.domain;

import Lotto.common.displayText.DisplayText;
import Lotto.common.exception.ExceptionMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Winning {

    public String getWinningResult(long matchCount){
        validateMatchCount(matchCount);
        String resultString = Arrays.stream(WinningResult.values())
                .map(result -> result.getPrizeMessage() + DisplayText.PRIZE_MESSAGE_SEPARATOR.getInputMessage() + result.getPrizeCount())
                .collect(Collectors.joining(DisplayText.NEW_LINE.getInputMessage()));

        return resultString;
    }

    public void matchWinningResult(Long matchCount){
        if(BonusWinning.checkIncrement(matchCount)) return;
        processWinningResult(matchCount);
    }

    public long calculateWinningResult(List<LottoNumber> winningNumber, List<LottoNumber> lottoNumbers, BonusNumber bonusNumber){
        long count = lottoNumbers.stream()
                .filter(lottoNumber -> compareWinningNumber(winningNumber, lottoNumber))
                .count();
        isBonus(bonusNumber, lottoNumbers, count);
        return count;
    }

    public Long calculatePrice(List<LottoNumber> winningNumber, Lottos lottos, BonusNumber bonusNumber){
        long max = 0;

        for(int i = 0; i < lottos.getNumberOfLottos(); i++){
            max = Math.max(max, calculateWinningResult(winningNumber, lottos.getLottos().get(i).getLotto(), bonusNumber));
        }

        return max;
    }

    private void isBonus(BonusNumber bonusNumber, List<LottoNumber> lottoNumbers, Long count){
        if(BonusWinning.matchBonusNumber(bonusNumber, lottoNumbers, count)){
            WinningResult.SECOND_BONUS_PRICE.incrementBonus();
        }
    }

    private boolean compareWinningNumber(List<LottoNumber> winningNumber, LottoNumber lottoNumber) {
        return winningNumber.stream()
                .anyMatch(winning -> winning.checkSameWinningNumber(lottoNumber));
    }

    private void processWinningResult(Long matchCount){
        for (WinningResult result : WinningResult.values()) {
            result.matchAndIncrement(matchCount);
        }
    }

    private void validateMatchCount(Long matchCount){
        if(matchCount < WinningResult.FOURTH_PRICE.getMatchCount())
            throw new IllegalArgumentException(ExceptionMessage.ZERO_MATCH_COUNT.getMessage());
    }

}
