package com.calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private static final int NUM_ZERO = 0;
    private static final int SECOND_INDEX = 2;
    private static final int THIRD_INDEX = 3;
    private static final int FOURTH_INDEX = 4;

    private static final String ENTER = "\n";
    private static final String SLASH = "//";
    private static final String BASIC_SYMBOL = "[,:]";

    public int calculateNumber(String message) {
        if (message == null || message.isEmpty()) {
            return NUM_ZERO;
        }
        if (detectCustomMessage(message)) {
            String customSeparator = getCustomSeparator(message);
            String operand = getOperand(message);
            return addNumbers(convertToNumber(save(separate(operand, customSeparator))));
        }
        return addNumbers(convertToNumber(save(separate(message, BASIC_SYMBOL))));
    }

    private boolean detectCustomMessage(String message) {
        boolean detection = false;
        if (message.startsWith(SLASH) && message.startsWith(ENTER, THIRD_INDEX)) {
            detection = true;
        }
        return detection;
    }

    private String getCustomSeparator(String message) {
        return message.split("")[SECOND_INDEX];
    }

    private String getOperand(String message) {
        return message.substring(FOURTH_INDEX);
    }

    private String[] separate(String message, String symbol) {
        return message.split(symbol);
    }

    private List<String> save(String[] letters) {
        List<String> splitLetters = new ArrayList<>();
        for (String letter : letters) {
            splitLetters.add(letter);
        }
        return splitLetters;
    }

    private List<Integer> convertToNumber(List<String> letters) {
        List<Integer> numbers = new ArrayList<>();
        for (String letter : letters) {
            try {
                int number = Integer.parseInt(letter);
                if (number < 0) throw new RuntimeException("음수는 입력할 수 없습니다.");
                numbers.add(Integer.parseInt(letter));
            } catch (NumberFormatException exception) {
                throw new RuntimeException("0이 아닌 수는 입력할 수 없습니다.");
            }
        }
        return numbers;
    }

    private int addNumbers(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
