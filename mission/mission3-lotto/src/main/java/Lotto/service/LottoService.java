package Lotto.service;

import Lotto.domain.Lotto;
import Lotto.exception.ExceptionMessage;

public class LottoService {

    public void validInputPrice(int inputPrice){
        if(inputPrice < Lotto.lottoPrice)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_PRICE.getMessage());
    }

}
