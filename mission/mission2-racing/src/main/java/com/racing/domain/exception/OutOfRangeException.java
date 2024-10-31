package com.racing.domain.exception;

public class OutOfRangeException extends RuntimeException{
    public OutOfRangeException() {
        super("9 이상은 에러를 발생시킵니다.");
    }
}
