package com.calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    private final String START_STRING = "//";
    private final String REPLACE_STRING = ",";

    private final String SEPARATOR_ERROR_MESSAGE = "확인되지 않은 구분자입니다.";
    private final String MINUS_ERROR_MESSAGE = "음수입니다.";

    public int processInputValue(String stringValue){
        List<String> seperatorList = getSeperatorList(stringValue);

        stringValue = tuneStringValue(stringValue);

        for (String seperator : seperatorList) {
            stringValue = stringValue.replaceAll(seperator, REPLACE_STRING);
        }

        return getSum(stringValue);
    }

    public List<String> getSeperatorList(String stringValue){
        List<String> seperatorList = new ArrayList<>();

        seperatorList.add(",");
        seperatorList.add(":");

        if (stringValue.startsWith(START_STRING)){
            seperatorList.add(stringValue.substring(2, 3));
        }

        return seperatorList;
    }

    public String tuneStringValue(String stringValue){
        if (stringValue.startsWith(START_STRING)) {
            String SLICE_STRING = "n";
            int sliceIndex = stringValue.indexOf(SLICE_STRING) + 1;
            stringValue = stringValue.substring(sliceIndex);
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

    public int getParsedInteger(String nums) {
        try {
            return isMinus(Integer.parseInt(nums));
        } catch (NumberFormatException e) {
            throw new RuntimeException(SEPARATOR_ERROR_MESSAGE);
        }
    }

    private int isMinus(int testNum) {
        if (testNum < 0) {
            throw new RuntimeException(MINUS_ERROR_MESSAGE);
        }
        return testNum;
    }
}
