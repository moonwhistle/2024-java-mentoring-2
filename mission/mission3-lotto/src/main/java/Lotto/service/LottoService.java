package Lotto.service;

import Lotto.common.exception.ExceptionMessage;
import Lotto.domain.Lotto;
import Lotto.domain.LottoNumber;
import Lotto.domain.Lottos;
import Lotto.domain.WinningResult;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LottoService {

    public String printLottoList(Lottos lottos){
        return lottos.getLottos().stream()
                .map(lotto -> lotto.toLottoDto().toString())
                .collect(Collectors.joining("\n"));
    }

    public int calculateLottoNumber(int inputPrice){
        return inputPrice / Lotto.lottoPrice;
    }

    public long calculateWinningResult(Lottos lottos, List<LottoNumber> winningNumber){
        return lottos.getLottos().stream()
                .mapToLong(lotto -> compareLottoAndWinningNumber(lotto, winningNumber))
                .max()
                .orElse(0);
    }

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

    private long compareLottoAndWinningNumber(Lotto lotto, List<LottoNumber> winningNumber) {
        return lotto.getLotto().stream()
                .filter(lottoNumber -> winningNumber.stream().anyMatch(winning -> lottoNumber.checkSame(winning)))
                .count();
    }

    private int matchPriceAndMatchCount(Long matchCount){
        if(matchCount < WinningResult.FOURTH_PRICE.getMatchCount())
            throw new IllegalArgumentException(ExceptionMessage.ZERO_MATCH_COUNT.getMessage());

        return Arrays.stream(WinningResult.values())
                .filter(result -> result.getMatchCount() == matchCount)
                .map(WinningResult::getPrice)
                .findFirst().orElse(0);
    }

}
