package com.racing.domain;

public class CarPosition {

    private static final int START_POSITION = 0;
    private int carPosition;

    public CarPosition() {
        validateIsPositivePosition(carPosition);
        this.carPosition = START_POSITION;
    }

    public int getCarPosition() {
        return carPosition;
    }

    private void validateIsPositivePosition(int carPosition) {
        if (carPosition < START_POSITION) {
            throw new IllegalArgumentException("음수인 위치는 오류를 발생시킵니다.");
        }
    }
}
