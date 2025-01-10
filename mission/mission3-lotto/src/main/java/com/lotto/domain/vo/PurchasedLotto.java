package com.lotto.domain.vo;

import java.util.ArrayList;
import java.util.List;

public class PurchasedLotto {
    private static final String SPACE_LETTER = "\n";

    private final List<Lotto> purchasedLotto = new ArrayList<>();

    public List<Lotto> getPurchasedLotto() {
        return this.purchasedLotto;
    }

    public void addLotto(Lotto lotto) {
        this.purchasedLotto.add(lotto);
    }

    public int getPurchasedLottoAmount(){
        return this.purchasedLotto.size();
    }

    public String getStringifyLotto(){
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
