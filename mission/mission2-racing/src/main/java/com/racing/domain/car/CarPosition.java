package com.racing.domain.car;

import com.racing.domain.exception.NegativeNumberException;

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
            throw new NegativeNumberException();
        }
    }
}
