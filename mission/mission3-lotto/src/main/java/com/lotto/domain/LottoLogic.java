package com.lotto.domain;

import com.lotto.domain.vo.Lotto;
import com.lotto.domain.vo.PurchasedLotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoLogic {
    private static final String SPACE_LETTER = "\n";

    private final LottoNumberGenerator lottoNumberGenerator;
    private final LottoConfig lottoConfig;

    public LottoLogic() {
        this.lottoNumberGenerator = new LottoNumberGenerator();
        this.lottoConfig = new LottoConfig();
    }

    public int getAvailableAmount(int integer) {
        return integer / lottoConfig.getLottoPrice();
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

        while (lottoNumbersSet.size() != lottoConfig.getLottoNumberCountLimit()) {
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
        return lotto.getLottoNumbers().toString() + SPACE_LETTER;
    }
}
