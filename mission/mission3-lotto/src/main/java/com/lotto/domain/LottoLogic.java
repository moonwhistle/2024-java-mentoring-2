package com.lotto.domain;

import com.lotto.domain.vo.Lotto;
import com.lotto.domain.vo.PurchasedLotto;

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

    public PurchasedLotto loopAvailableAmount(int availableAmount) {
        PurchasedLotto purchaseLotto = new PurchasedLotto();

        for (int i = 0; i < availableAmount; i++) {
            Lotto lotto = getLotto();
            purchaseLotto.addLotto(lotto);
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

    public String stringifyLottoList(List<Lotto> purchasedLotto) {
        StringBuilder lottoString = new StringBuilder();

        for (Lotto lotto : purchasedLotto) {
            lottoString.append(buildLottoNumbersString(lotto));
        }

        return String.valueOf(lottoString);
    }

    private String buildLottoNumbersString(Lotto lotto) {
        return lotto.getLottoNumbers().toString() + "\n";
    }
}
