package com.racing.domain.exception;

public class ExceedNameLengthException extends RuntimeException {
    public ExceedNameLengthException() {
        super("차 이름은 5자 이하이어야 합니다");
    }
}
