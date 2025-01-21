package com.racing.domain.exception;

public class EmptyValueException extends RuntimeException {
    public EmptyValueException() {
        super("빈 값이 될 수 없습니다.");
    }
}
