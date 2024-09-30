package com.calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private final String inputString;
    private final String CHECK_FIRST_STRING = "/";
    private final int ZERO_NUM = 0;
    private final int FIRST_INDEX = 1;
    private final int SECOND_INDEX = 2;
    private final String CHECK_USER_DEFINED = "\n";
    private final String SPLIT_SEPERATOR = "[:|;]";

    public StringCalculator(final String inputString){
        this.inputString = inputString;
    }

    public List<String> stringList(){
        String firstString = getSubString(inputString, ZERO_NUM, FIRST_INDEX);
        if(!firstString.equals(CHECK_FIRST_STRING)){
            String[] splitArray = splitList(inputString,SPLIT_SEPERATOR);
            return makeStringList(splitArray);
        }

        return userDefinedList();
    }

    private List<String> userDefinedList(){
        int search_index = inputString.indexOf(CHECK_USER_DEFINED);
        String new_sep = getSubString(inputString, SECOND_INDEX, search_index);
        int new_start_index = search_index + 1;
        String newStr = inputString.substring(new_start_index);
        String[] strArr = splitList(newStr, new_sep);

        return makeStringList(strArr);
    }

    private String getSubString(String input, int start, int end){
        String subString = input.substring(start, end);

        return subString;
    }

    private String[] splitList(String input, String seperator){
        String[] strList = input.split(seperator);

        return strList;
    }

    private List<String> makeStringList(String[] stringArray){
        return List.of(stringArray);
    }

    public List<Integer> StringToNum(List<String> stringNum){
        List<Integer> numList = new ArrayList<>();
        for(String str : stringNum){
            checkMinusOrNotInteger(str);
            numList.add(Integer.parseInt(str));
        }
        return numList;
    }

    private void checkMinusOrNotInteger(String str){
        int num = ZERO_NUM;
        try{
            num = Integer.parseInt(str);
        }
        catch(NumberFormatException e){
            throw new NumberFormatException();
        }
        if(num < ZERO_NUM){
            throw new RuntimeException();
        }
    }

    public int addNum(List<Integer> numList){
        int sum = ZERO_NUM;
        for(int num : numList){
            sum += num;
        }
        return sum;
    }
}
