package Lotto.service;

import Lotto.domain.Lotto;
import Lotto.domain.LottoNumber;
import Lotto.domain.Lottos;
import Lotto.domain.WinningResult;

import java.util.Arrays;
import java.util.List;
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

    private long compareLottoAndWinningNumber(Lotto lotto, List<LottoNumber> winningNumber) {
        return lotto.getLotto().stream()
                .filter(lottoNumber -> winningNumber.stream().anyMatch(winning -> lottoNumber.checkSame(winning)))
                .count();
    }

}
