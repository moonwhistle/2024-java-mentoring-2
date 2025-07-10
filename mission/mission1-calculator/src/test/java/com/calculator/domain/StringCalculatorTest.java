package com.calculator.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void regularSplitString() {
        String firstFactor = "1,2,3";
        String secondFactor = "1;2;3";

        String message = ";";

        String[] expect = {"1", "2", "3"};
        String[] NotExpect = {"2", "1", "3"};

        String[] firstResult = stringCalculator.regularSplitString(firstFactor, message);
        String[] secondResult = stringCalculator.regularSplitString(secondFactor, message);

        Assertions.assertAll(
                () -> assertArrayEquals(firstResult, expect),
                () -> assertArrayEquals(secondResult, expect),
                () -> assertFalse(Arrays.equals(NotExpect, firstResult)),
                () -> assertFalse(Arrays.equals(NotExpect, secondResult))

        );


    }

    @Test
    void checkStartString() {
        String firstFactor = "//;\n1;2;3";
        String secondFactor = "1,2:3";

        String firstExpect = "1;2;3";
        String secondExpect = "1,2:3";
        String NotfitstExpect = "1:2:3";
        String NotsecontExpect = "1:2,3";

        String firstResult = stringCalculator.checkStartString(firstFactor);
        String secondResult = stringCalculator.checkStartString(secondFactor);

        Assertions.assertAll(
                () -> assertEquals(firstResult, firstExpect),
                () -> assertEquals(secondResult, secondExpect),
                () -> assertNotEquals(firstResult, NotfitstExpect),
                () -> assertNotEquals(secondResult, NotsecontExpect)
        );
    }

    @Test
    void subStringMessage() {
        String factor = "//;\n1;2;3";

        String expect = ";";
        String result = stringCalculator.subStringMessage(factor);

        assertEquals(expect, result);
    }
}
