package com.racing.domain.exception;

public class NegativeNumberException extends RuntimeException {
    public NegativeNumberException() {
        super("숫자나 위치가 음수일 수 없습니다.");
    }
}
