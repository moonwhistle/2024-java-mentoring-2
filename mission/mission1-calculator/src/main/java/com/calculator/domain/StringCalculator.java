package com.calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    private final String inputString;
    private final String CHECK_FIRST_STRING = "/";

    private final int ZERO_NUM = 0;
    private final int FIRST_INDEX = 1;
    private final int SECOND_INDEX = 2;

    private final String NEW_STRING_FIND = "\n";
    private final String SPLIT_STRING = "[:|;]";
    public StringCalculator(final String inputString){
        this.inputString = inputString;
    }

    public List<String> stringList(){
        String firstString = inputString.substring(ZERO_NUM, FIRST_INDEX);
        if(!firstString.equals(CHECK_FIRST_STRING)){
            String[] strArr = inputString.split(SPLIT_STRING);
            return List.of(strArr);
        }
        int search_index = inputString.indexOf(NEW_STRING_FIND);
        String new_sep = inputString.substring(SECOND_INDEX, search_index);
        int new_start_index = search_index + 1;
        String[] strArr = inputString.substring(new_start_index).split(new_sep);

        return List.of(strArr);
    }

    public List<Integer> StringToNum(List<String> stringNum){
        List<Integer> numList = new ArrayList<>();
        for(String str : stringNum){
            checkMinusOrNotInteger(str);
            numList.add(Integer.parseInt(str));
        }
        return numList;
    }

    public void checkMinusOrNotInteger(String str){
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
