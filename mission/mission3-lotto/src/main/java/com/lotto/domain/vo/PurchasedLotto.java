package com.lotto.domain.vo;

import java.util.ArrayList;
import java.util.List;

public class PurchasedLotto {
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
}
