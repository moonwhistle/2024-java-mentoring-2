package com.calculator.domain;

public class StringCalculator {

    private static final int NUM_ZERO = 0;
    private static final int FIRST_INDEX = 1;
    private static final int THIRD_INDEX = 3;
    private static final String BASIC_SEPARATOR = "[,:]";
    private static final String DOUBLE_SLASH = "//";
    private static final String ENTER = "\n";

    private final String stringOperand;

    public StringCalculator(String stringOperand) {
        this.stringOperand = stringOperand;
    }

    public int calculateString() {
        int result = NUM_ZERO;
        if (stringOperand.startsWith(DOUBLE_SLASH) && stringOperand.indexOf(ENTER) == THIRD_INDEX) {
            String newOperands = replaceMessage();
            String[] arrayOfNumber = splitOperand(newOperands, extractCustom());
            for (String number : arrayOfNumber) {
                result += Integer.parseInt(number);
            }
        } else {
            String[] arrayOfNumber = splitOperand(stringOperand, BASIC_SEPARATOR);
            for (String number : arrayOfNumber) {
                result += Integer.parseInt(number);
            }
        }
        return result;
    }

    private String replaceMessage() {
        String replacedOperand = stringOperand.replace(DOUBLE_SLASH, "");
        return replacedOperand.replace(ENTER, "");
    }

    private String extractCustom() {
        return stringOperand.substring(NUM_ZERO, FIRST_INDEX);
    }

    private String[] splitOperand(String messages, String separator) {
        return messages.split(separator);
    }
}
