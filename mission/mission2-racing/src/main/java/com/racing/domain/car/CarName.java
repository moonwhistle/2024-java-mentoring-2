package com.racing.domain.car;

import com.racing.common.exception.EmptyNameValueException;
import com.racing.common.exception.ExcessiveNameLengthException;

public class CarName {

    private final String carName;

    public CarName(final String carName) {
        validateCarNameValue(carName);
        validateCarNameLength(carName);
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    private void validateCarNameValue(String carName) {
        if (carName == null || carName.isEmpty()) {
            throw new EmptyNameValueException();
        }
    }

    private void validateCarNameLength(String carName) {
        if (carName.length() > 5 ) {
            throw new ExcessiveNameLengthException();
        }
    }
}
