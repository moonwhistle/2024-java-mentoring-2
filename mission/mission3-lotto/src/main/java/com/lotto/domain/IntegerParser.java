package com.lotto.domain;

import com.lotto.domain.exception.UnderMinPriceErrorException;
import com.lotto.domain.exception.NaNErrorException;
import com.lotto.domain.exception.NotIntegerException;

public class IntegerParser {
    private final int MIN_LOTTO_PRICE = 1000;

    public int parseInteger(String str) {
        try {
            int integerStr = isInteger(str);
            return isUnderMinPrice(integerStr);
        } catch (NumberFormatException e) {
            throw new NaNErrorException(ErrorMessage.NAN_ERROR.getMessage());
        }
    }

    private int isUnderMinPrice(int num) {
        if (num < MIN_LOTTO_PRICE) {
            throw new UnderMinPriceErrorException(ErrorMessage.MIN_PRICE_ERROR.getMessage());
        }

        return num;
    }

    private int isInteger(String str) {
        double doubleStr = Double.parseDouble(str);

        if(doubleStr != (int) doubleStr){
            throw new NotIntegerException(ErrorMessage.NOT_INTEGER_ERROR.getMessage());
        }

        return (int) doubleStr;
    }
}
