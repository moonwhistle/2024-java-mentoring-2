package Lotto.domain;

import java.util.List;
import java.util.stream.Collectors;

public class WinningNumber {

    private List<LottoNumber> winningNumber;

    public WinningNumber(List<Integer> winningNumber){
        this.winningNumber = winningNumber.stream()
                .map(this::toLottoNumber)
                .collect(Collectors.toList());
    }

    private LottoNumber toLottoNumber(int number){
        return new LottoNumber(number);
    }

}
