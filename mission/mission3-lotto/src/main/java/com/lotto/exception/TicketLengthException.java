package com.lotto.exception;

public class TicketLengthException extends RuntimeException {
    public TicketLengthException() {
        super("잘못된 로또입니다.");
    }
}
