package com.racingcar.domain;

public class RacingCarLogic {

    private final String NAN_ERROR_MESSAGE = "입력된 값이 숫자가 아닙니다.";
    private final String NOT_INTEGER_ERROR_MESSAGE = "입력된 값이 정수가 아닙니다.";
    private final String MINUS_ERROR_MESSAGE = "입력된 값이 음수입니다.";

    public int parseTryCount(String str) {
        try {
            int integerStr = isInteger(str);
            return isMinus(integerStr);
        } catch (NumberFormatException e) {
            throw new RuntimeException(NAN_ERROR_MESSAGE);
        }
    }

    private int isMinus(int num) {
        if (num < 0) {
            throw new RuntimeException(MINUS_ERROR_MESSAGE);
        }

        return num;
    }

    private int isInteger(String str) {

        double doubleStr = Double.parseDouble(str);

        if(doubleStr != (int) doubleStr){
            throw new RuntimeException(NOT_INTEGER_ERROR_MESSAGE);
        }

        return (int) doubleStr;
    }

    public Cars loopTryCount(int tryCount, Cars cars){
        for(int i = 0; i < tryCount; i++){
            cars.moveCars();
        }

        return cars;
    }
}
