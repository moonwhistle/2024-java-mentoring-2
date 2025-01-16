package com.racing.dto;

public class RacingResponse {

    private final String winner;

    public RacingResponse(String winner) {
        this.winner = winner;
    }

    public String getWinner() {
        return winner;
    }
}
