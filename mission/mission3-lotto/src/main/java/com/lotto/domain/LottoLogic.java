package com.lotto.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoLogic {
    private final int LOTTO_PRICE = 1000;
    private final int LOTTO_NUM_LIMIT = 6;

    private final LottoNumberGenerator lottoNumberGenerator;

    public LottoLogic(){
        this.lottoNumberGenerator = new LottoNumberGenerator();
    }

    public int getAvailableAmount(int integer) {
        return integer / LOTTO_PRICE;
    }

    public Set<Integer> drawLottoNumbers() {
        Set<Integer> lottoNumbersSet = new HashSet<>();

        while(lottoNumbersSet.size() != LOTTO_NUM_LIMIT){
            int lottoNumber = lottoNumberGenerator.getLottoNumber();
            lottoNumbersSet.add(lottoNumber);
        }

        return lottoNumbersSet;
    }
}
