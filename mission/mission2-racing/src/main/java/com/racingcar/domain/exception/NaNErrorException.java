package com.racingcar.domain.exception;

public class NaNErrorException extends RuntimeException {
    public NaNErrorException(String message) {
        super(message);
    }
}
