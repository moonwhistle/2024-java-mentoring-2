package Lotto.service;

import Lotto.domain.Lotto;
import Lotto.common.exception.ExceptionMessage;
import Lotto.domain.Lottos;

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

}
