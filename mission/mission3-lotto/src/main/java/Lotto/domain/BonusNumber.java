package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;

public class BonusNumber {

    private final LottoNumber bonusNumber;

    public BonusNumber(String number){
        int bonusNumber = toInteger(number);
        this.bonusNumber = toLottoNumber(bonusNumber);
    }

    public static BonusNumber bonusNumberOf(String number){
        return new BonusNumber(number);
    }

    public boolean isBonusApplication(Long matchCount){
        return matchCount == WinningResult.SECOND_PRICE.getMatchCount();
    }

    public LottoNumber getBonusNumber(){
        return bonusNumber;
    }

    private LottoNumber toLottoNumber(int bonusNumber){
        return new LottoNumber(bonusNumber);
    }

    private int toInteger(String bonusNumber){
        try{
            return Integer.parseInt(bonusNumber);
        }
        catch(IllegalArgumentException e){
            throw new IllegalArgumentException(ExceptionMessage.CANNOT_PARSE_TO_INT.getMessage());
        }
    }

}
