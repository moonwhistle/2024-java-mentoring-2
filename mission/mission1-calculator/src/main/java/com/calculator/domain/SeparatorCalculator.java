package com.calculator.domain;


import java.util.Arrays;

public class SeparatorCalculator {


    private String extractSeparator(String text) {
        int index = text.indexOf("\n");
        return text.substring(2,index);
    }

    private String extractNumber(String text) {
        int index = text.indexOf("\n");
        return text.substring(index+1);
    }

    private int calculatorSum(String text , String separator) {
        String[] textArray = text.split(separator);
        return Arrays
                .stream(textArray)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
