package com.racing.domain.car;

import com.racing.domain.exception.EmptyValueException;

public class CarPosition {

    private static final String POSITION_POINT = "-";

    private String carPosition;

    public CarPosition() {
        carPosition = POSITION_POINT;
        validatePositionExist(carPosition);
    }

    public void addPosition() {
        carPosition+=POSITION_POINT;
    }

    public String getPosition() {
        return carPosition;
    }

    private void validatePositionExist(String carPosition) {
        if (carPosition == null || carPosition.isEmpty()) {
            throw new EmptyValueException();
        }
    }
}
