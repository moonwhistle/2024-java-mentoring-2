package com.lotto.exception;

public class OutOfRangeException extends RuntimeException {
    public OutOfRangeException() {
        super("유효하지 않은 범위를 초과하는 수입니다.");
    }
}
