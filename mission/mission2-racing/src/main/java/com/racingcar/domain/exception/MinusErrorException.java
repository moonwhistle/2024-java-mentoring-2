package com.racingcar.domain.exception;

public class MinusErrorException extends RuntimeException {
    public MinusErrorException(String message) {
        super(message);
    }
}
