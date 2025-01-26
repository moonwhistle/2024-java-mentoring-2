package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;

public class LottoNumber {

    private final int lottoNumber;

    public LottoNumber(int lottoNumber){
        this.lottoNumber = lottoNumber;
        numberOutOfRange();
    }

    public int getLottoNumber(){
        return lottoNumber;
    }

    public void numberOutOfRange(){
        if(lottoNumber > 45 || lottoNumber < 1)
            throw new IllegalArgumentException(ExceptionMessage.NUMBER_OUT_OF_RANGE.getMessage());
    }

    public boolean checkSameWinningNumber(LottoNumber winningNumber){
        if(this.lottoNumber == winningNumber.getLottoNumber())
            return true;

        return false;
    }

}
