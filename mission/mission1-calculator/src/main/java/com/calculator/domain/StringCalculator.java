package com.calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private static final int NUM_ZERO = 0;
    private static final int SECOND_INDEX = 2;
    private static final int FOURTH_INDEX = 4;

    private static final String SLASH = "//";
    private static final String BASIC_SYMBOL = "[,:]";

    public int calculateNumber(String message) {
        if (message == null || message.isEmpty()) {
            return NUM_ZERO;
        }
        String symbol = getSeparator(message);
        String formula = getMessage(message);
        String[] element = separate(formula, symbol);
        List<Integer> numbers = saveNumbers(element);
        return addNumbers(numbers);
    }

    public String getSeparator(String message) {
        if (message.startsWith(SLASH)) {
            return message.split("")[SECOND_INDEX];
        }
        return BASIC_SYMBOL;
    }

    public String getMessage(String message) {
        if (message.startsWith(SLASH)) {
            return message.substring(FOURTH_INDEX);
        }
        return message;
    }

    public String[] separate(String message, String symbol) {
        return message.split(symbol);
    }

    private List<Integer> saveNumbers(String[] letters) {
        List<Integer> onlyNumbers = new ArrayList<>();
        for (String letter : letters) {
            detectError(onlyNumbers, letter);
        }
        return onlyNumbers;
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

    private int addNumbers(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
