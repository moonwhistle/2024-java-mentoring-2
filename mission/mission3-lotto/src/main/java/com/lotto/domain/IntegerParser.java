package com.lotto.domain;

import com.lotto.domain.exception.UnderMinPriceErrorException;
import com.lotto.domain.exception.NaNErrorException;
import com.lotto.domain.exception.NotIntegerException;

public class IntegerParser {
    private final int MIN_LOTTO_PRICE = 1000;

    private final String NAN_ERROR_MESSAGE = "입력된 값이 숫자가 아닙니다.";
    private final String NOT_INTEGER_ERROR_MESSAGE = "입력된 값이 정수가 아닙니다.";
    private final String MINUS_ERROR_MESSAGE = "로또를 구매하기 위한 최소 금액은 1000원입니다.";

    public int parseInteger(String str) {
        try {
            int integerStr = isInteger(str);
            return isUnderMinPrice(integerStr);
        } catch (NumberFormatException e) {
            throw new NaNErrorException(NAN_ERROR_MESSAGE);
        }
    }

    private int isUnderMinPrice(int num) {
        if (num < MIN_LOTTO_PRICE) {
            throw new UnderMinPriceErrorException(MINUS_ERROR_MESSAGE);
        }

        return num;
    }

    private int isInteger(String str) {
        double doubleStr = Double.parseDouble(str);

        if(doubleStr != (int) doubleStr){
            throw new NotIntegerException(NOT_INTEGER_ERROR_MESSAGE);
        }

        return (int) doubleStr;
    }
}
