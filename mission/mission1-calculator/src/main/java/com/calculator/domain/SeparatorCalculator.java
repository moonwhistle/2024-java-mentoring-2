package com.calculator.domain;

import java.util.Arrays;

public class SeparatorCalculator {

    public static final String BASIC_SEPARATOR = "[,;]";
    public static final String NEGATIVE_NUMBER = "숫자가 음수입니다.";

    public String selectSeparator(String text) {
        if(text.startsWith("//")) {
             return text.substring(2,3);
        }
        return BASIC_SEPARATOR;
    }

    public String numberText(String text){
        if(text.startsWith("//")) {
            return text.substring(text.indexOf("\n")+1);
        }
        return text;
    }

    public int calculatorSum(String text , String separator) {
        return  negativeNumberException(text,separator);
    }

    private int negativeNumberException(String text, String separator){
        String[] textArray = text.split(separator);
        for(String str : textArray){
            int number = Integer.parseInt(str);
            if(number < 0){
            throw new RuntimeException(NEGATIVE_NUMBER);
            }
        }
        return Arrays
                .stream(textArray)
                .mapToInt(Integer::parseInt)
                .sum();
    }

}
