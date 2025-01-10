package com.lotto.domain.vo;

import com.lotto.domain.LottoLogic;

import java.util.ArrayList;
import java.util.List;

public class PurchasedLotto {
    private final List<Lotto> purchasedLotto = new ArrayList<>();
    private final LottoLogic lottoLogic;

    public PurchasedLotto(){
        this.lottoLogic = new LottoLogic();
    }

    public List<Lotto> getPurchaseLotto() {
        return this.purchasedLotto;
    }

    public void addLotto(Lotto lotto) {
        this.purchasedLotto.add(lotto);
    }

    public String getStringPurchasedLotto() {
        return lottoLogic.stringifyLottoList(this.purchasedLotto);
    }

    public int getPurchasedLottoAmount(){
        return this.purchasedLotto.size();
    }
}
