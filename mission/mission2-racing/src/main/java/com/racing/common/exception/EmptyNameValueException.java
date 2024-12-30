package com.racing.common.exception;

public class EmptyNameValueException extends RuntimeException {
    public EmptyNameValueException() { super("차의 이름을 입력하세요.");}
}
