package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WinningNumber {

    private static final String splitBy = ",";
    private static final int validNumberOfLotto = 6;
    private List<LottoNumber> winningNumber;

    public WinningNumber(String winningNumber){
        List<Integer> winning = Arrays.stream(winningNumber.split(splitBy))
                .map(String::trim)
                .map(Integer::parseInt)
                .distinct()
                .collect(Collectors.toList());

        if(winning.size() != validNumberOfLotto)
            throw new IllegalArgumentException(ExceptionMessage.INVALID_WINNING_RESULT.getMessage());

        this.winningNumber = winning.stream()
                .map(this::toLottoNumber)
                .collect(Collectors.toList());
    }

    public List<LottoNumber> getWinningNumber(){
        return winningNumber;
    }

    private LottoNumber toLottoNumber(int number){
        return new LottoNumber(number);
    }

}
