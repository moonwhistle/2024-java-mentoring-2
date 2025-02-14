package Lotto.domain;

import java.util.List;

public class BonusWinning {

    private static final int noBonus = 0;

    public static boolean getBonusBall(){
        if(WinningResult.SECOND_BONUS_PRICE.getBonus() != noBonus) {
            WinningResult.SECOND_BONUS_PRICE.incrementPrizeCount();
            return true;
        }
        return false;
    }

    public static boolean matchBonusNumber(BonusNumber bonusNumber, List<LottoNumber> lottoNumbers, long matchCount){
        if(bonusNumber.isBonusApplication(matchCount)) {
            return lottoNumbers.stream()
                    .anyMatch(winning -> winning.checkSameWinningNumber(bonusNumber.getBonusNumber()));
        }
        return false;
    }

    public static boolean checkIncrement(Long matchCount){
        return allMatch(matchCount) || getBonusBall();
    }

    private static boolean allMatch(long matchCount){
        if(matchCount == WinningResult.FIRST_PRICE.getMatchCount()) {
            WinningResult.FIRST_PRICE.incrementPrizeCount();
            return true;
        }
        return false;
    }

}
