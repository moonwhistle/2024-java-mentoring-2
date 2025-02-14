package Lotto.dto;

import Lotto.domain.Lotto;
import Lotto.domain.LottoNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public record LottoDto(List<LottoNumber> lottoNumber) {

    public List<Integer> getLotto(){
        return new ArrayList<>(lottoNumber().stream()
                .map(lottoNumber -> lottoNumber.getLottoNumber())
                .collect(Collectors.toList()));
    }

    public LottoDto toLottoDto(Lotto lotto){
        return new LottoDto(lotto.getLotto());
    }

}
