package com.racing.common.exception;

public class ExcessiveNameLengthException extends RuntimeException {
    public ExcessiveNameLengthException() {
        super("차의 이름은 5자 이하이어야 합니다.");
    }
}
