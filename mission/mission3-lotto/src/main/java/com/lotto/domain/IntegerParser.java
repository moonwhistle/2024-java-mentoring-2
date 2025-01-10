package com.lotto.domain;

import com.lotto.domain.exception.MinusErrorException;
import com.lotto.domain.exception.NaNErrorException;
import com.lotto.domain.exception.NotIntegerException;

public class IntegerParser {
    private final String NAN_ERROR_MESSAGE = "입력된 값이 숫자가 아닙니다.";
    private final String NOT_INTEGER_ERROR_MESSAGE = "입력된 값이 정수가 아닙니다.";
    private final String MINUS_ERROR_MESSAGE = "입력된 값이 음수입니다.";

    public int parseInteger(String str) {
        try {
            int integerStr = isInteger(str);
            return isMinus(integerStr);
        } catch (NumberFormatException e) {
            throw new NaNErrorException(NAN_ERROR_MESSAGE);
        }
    }

    private int isMinus(int num) {
        if (num < 0) {
            throw new MinusErrorException(MINUS_ERROR_MESSAGE);
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
