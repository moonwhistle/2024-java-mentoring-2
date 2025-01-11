package com.lotto.domain;

import com.lotto.common.LottoConfig;

import com.lotto.domain.exception.InvalidLottoNumberCountException;
import com.lotto.domain.vo.Lotto;
import com.lotto.domain.vo.PurchasedLotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoLogic {
    private final LottoConfig lottoConfig;
    private final IntegerParser integerParser;

    public LottoLogic(LottoConfig lottoConfig) {
        this.lottoConfig = lottoConfig;
        this.integerParser = new IntegerParser(lottoConfig);
    }

    public int getAvailableAmount(String stringPurchaseAmount) {
        int purchaseAmount = integerParser.parseInteger(stringPurchaseAmount);

        return purchaseAmount / lottoConfig.getLottoPrice();
    }

    public PurchasedLotto loopAvailableAmount(int availableAmount) {
        List<Lotto> purchaseLotto = new ArrayList<>();

        for (int i = 0; i < availableAmount; i++) {
            Set<Integer> lottoNumbers = getLottoNumberSet();
            Lotto lotto = getLotto(lottoNumbers);
            purchaseLotto.add(lotto);
        }

        return new PurchasedLotto(purchaseLotto);
    }

    private Lotto getLotto(Set<Integer> lottoNumbersSet) {
        validateLottoNumber(lottoNumbersSet);

        return new Lotto(lottoNumbersSet);
    }

    private Set<Integer> getLottoNumberSet() {
        Set<Integer> lottoNumbersSet = new HashSet<>();

        while (lottoNumbersSet.size() != lottoConfig.getLottoTicketNumberCountLimit()) {
            int lottoNumber = lottoConfig.getLottoNumber();
            lottoNumbersSet.add(lottoNumber);
        }

        return lottoNumbersSet;
    }

    private void validateLottoNumber(Set<Integer> lottoNumbersSet) {
        if (lottoNumbersSet.size() != lottoConfig.getLottoTicketNumberCountLimit()) {
            throw new InvalidLottoNumberCountException(ErrorMessage.INVALID_LOTTO_NUMBER_COUNT_ERROR.getMessage());
        }
    }
}
