package com.racing.domain.exception;

public class OutOfRangeException extends RuntimeException {
    public OutOfRangeException() {
        super("범위를 초과하는 생성되었습니다.");
    }
}
