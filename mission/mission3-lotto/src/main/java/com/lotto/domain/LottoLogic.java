package com.lotto.domain;

import com.lotto.domain.vo.Lotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoLogic {
    private final int LOTTO_PRICE = 1000;
    private final int LOTTO_NUM_LIMIT = 6;

    private final LottoNumberGenerator lottoNumberGenerator;

    public LottoLogic() {
        this.lottoNumberGenerator = new LottoNumberGenerator();
    }

    public int getAvailableAmount(int integer) {
        return integer / LOTTO_PRICE;
    }

    public List<Lotto> loopAvailableAmount(int availableAmount) {
        List<Lotto> purchaseLotto = new ArrayList<>();

        for (int i = 0; i < availableAmount; i++) {
            Lotto lotto = getLotto();
            purchaseLotto.add(lotto);
        }

        return purchaseLotto;
    }

    public Lotto getLotto() {
        Set<Integer> lottoNumbersSet = new HashSet<>();

        while (lottoNumbersSet.size() != LOTTO_NUM_LIMIT) {
            int lottoNumber = lottoNumberGenerator.getLottoNumber();
            lottoNumbersSet.add(lottoNumber);
        }

        return new Lotto(lottoNumbersSet);
    }
}
