package com.lotto.domain;

import com.lotto.domain.exception.UnderMinPriceErrorException;
import com.lotto.domain.exception.NaNErrorException;
import com.lotto.domain.exception.NotIntegerException;

public class IntegerParser {
    private final LottoConfig lottoConfig;

    public IntegerParser() {
        this.lottoConfig = new LottoConfig();
    }

    public int parseInteger(String str) {
        try {
            int integerStr = isInteger(str);
            return isUnderMinimumLottoPrice(integerStr);
        } catch (NumberFormatException e) {
            throw new NaNErrorException(ErrorMessage.NAN_ERROR.getMessage());
        }
    }

    private int isUnderMinimumLottoPrice(int num) {
        if (num < lottoConfig.getLottoPrice()) {
            throw new UnderMinPriceErrorException(ErrorMessage.MIN_PRICE_ERROR.getMessage());
        }

        return num;
    }

    private int isInteger(String str) {
        double doubleStr = Double.parseDouble(str);

        if (doubleStr != (int) doubleStr) {
            throw new NotIntegerException(ErrorMessage.NOT_INTEGER_ERROR.getMessage());
        }

        return (int) doubleStr;
    }
}
