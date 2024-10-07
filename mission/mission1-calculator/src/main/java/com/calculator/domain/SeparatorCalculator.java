package com.calculator.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparatorCalculator {

    public int separatorSum(String text , String separator) {
        String[] textArray = text.split(separator);
        return Arrays
                .stream(textArray)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}

