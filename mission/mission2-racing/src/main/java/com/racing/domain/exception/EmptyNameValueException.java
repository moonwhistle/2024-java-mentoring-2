package com.racing.domain.exception;

public class EmptyNameValueException extends RuntimeException {
    public EmptyNameValueException() {
        super("차의 이름은 빈 값이 될 수 없습니다.");
    }
}
