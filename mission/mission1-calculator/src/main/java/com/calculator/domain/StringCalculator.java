package com.calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private static final int SECOND_INDEX = 2;
    public static final int BEGIN_INDEX = 5;

    private static final String SLASH = "//";
    private static final String BASIC_SYMBOL = "[,:]";

    public String getSeparator(String message) {
        validateNumber(message);
        if (message.startsWith(SLASH)) {
            return message.split("")[SECOND_INDEX];
        }
        return BASIC_SYMBOL;
    }

    public String getMessage(String message) {
        if (message.startsWith(SLASH)) {
            return message.substring(BEGIN_INDEX);
        }
        return message;
    }

    public String[] separate(String message, String symbol) {
        return message.split(symbol);
    }

    public List<Integer> saveNumbers(String[] letters) {
        List<Integer> onlyNumbers = new ArrayList<>();
        for (String letter : letters) {
            detectError(onlyNumbers, letter);
        }
        return onlyNumbers;
    }

    public int addNumbers(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    private void detectError(List<Integer> numbers, String letter) {
        try {
            int number = Integer.parseInt(letter);
            detectNegativeNumbers(number);
            numbers.add(number);
        } catch (NumberFormatException exception) {
            throw new RuntimeException("숫자가 아닌 값은 입력할 수 없습니다.");
        }
    }

    private void detectNegativeNumbers(int number) {
        if (number < 0) throw new RuntimeException("음수는 입력할 수 없습니다.");
    }

    private void validateNumber(String message) {
        if (message == null || message.isEmpty()) {
            throw new RuntimeException("0");
        }
    }
}
