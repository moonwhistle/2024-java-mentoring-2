package com.calculator.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringCalculator {

    private final String START_STRING = "//";
    private final String REPLACE_STRING = ",";
    private final String SLICE_STRING = "n";
    private final String[] NORMAL_SEPERATOR_ARRAY = {",", ":"};

    private final String SEPARATOR_ERROR_MESSAGE = "확인되지 않은 구분자입니다.";
    private final String MINUS_ERROR_MESSAGE = "음수입니다.";

    public int processInputValue(String stringValue){
        List<String> seperatorList = getSeperatorList(stringValue);

        stringValue = tuneStringValue(stringValue);
        stringValue = generalizeSeperator(seperatorList, stringValue);
        
        return getSum(stringValue);
    }

    public List<String> getSeperatorList(String stringValue){
        List<String> seperatorList = new ArrayList<>();

        Collections.addAll(seperatorList, NORMAL_SEPERATOR_ARRAY);

        if (stringValue.startsWith(START_STRING)){
            seperatorList.add(stringValue.substring(2, 3));
        }

        return seperatorList;
    }

    public String tuneStringValue(String stringValue){
        if (stringValue.startsWith(START_STRING)) {
            int sliceIndex = stringValue.indexOf(SLICE_STRING) + 1;
            stringValue = stringValue.substring(sliceIndex);
        }

        return stringValue;
    }

    public String generalizeSeperator(List<String> seperatorList, String stringValue){
        for (String seperator : seperatorList) {
            stringValue = stringValue.replaceAll(seperator, REPLACE_STRING);
        }

        return stringValue;
    }

    public int getSum(String stringValue){
        int sum = 0;

        String[] splitedStringArray = stringValue.split(REPLACE_STRING);

        for (String str : splitedStringArray) {
            sum += getParsedInteger(str);
        }

        return sum;
    }

    public int getParsedInteger(String str) {
        try {
            return isMinus(Integer.parseInt(str));
        } catch (NumberFormatException e) {
            throw new RuntimeException(SEPARATOR_ERROR_MESSAGE);
        }
    }

    private int isMinus(int num) {
        if (num < 0) {
            throw new RuntimeException(MINUS_ERROR_MESSAGE);
        }

        return num;
    }
}
