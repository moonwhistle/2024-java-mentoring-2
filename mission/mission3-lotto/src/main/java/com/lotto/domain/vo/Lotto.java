package com.lotto.domain.vo;

import com.lotto.common.LottoConfig;

import com.lotto.domain.ErrorMessage;
import com.lotto.domain.exception.InvalidLottoNumberCountException;

import java.util.Set;

public record Lotto(Set<Integer> lottoNumbers, LottoConfig lottoConfig) {
    public Lotto(Set<Integer> lottoNumbers, LottoConfig lottoConfig) {
        this.lottoConfig = lottoConfig;
        this.lottoNumbers = lottoNumbers;

        if (lottoNumbers.size() != lottoConfig.getLottoTicketNumberCountLimit()) {
            throw new InvalidLottoNumberCountException(ErrorMessage.INVALID_LOTTO_NUMBER_COUNT_ERROR.getMessage());
        }
    }
}
