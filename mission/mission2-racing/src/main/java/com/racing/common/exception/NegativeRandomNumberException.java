package com.racing.common.exception;

public class NegativeRandomNumberException extends RuntimeException {
    public NegativeRandomNumberException() {
        super("0 이하의 숫자는 에러를 발생시킨다.");
    }
}
