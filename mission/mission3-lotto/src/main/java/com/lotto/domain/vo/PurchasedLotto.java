package com.lotto.domain.vo;

import java.util.List;

public record PurchasedLotto(List<Lotto> purchasedLotto) {
    private static final String SPACE_LETTER = "\n";

    public int getPurchasedLottoAmount() {
        return this.purchasedLotto.size();
    }

    public String getStringifyLotto() {
        return stringifyLottoList(this.purchasedLotto);
    }

    private String stringifyLottoList(List<Lotto> purchasedLotto) {
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
