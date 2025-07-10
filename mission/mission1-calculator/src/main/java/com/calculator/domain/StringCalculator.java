package com.calculator.domain;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringCalculator {
    private final String INPUT_REG = "[,:]";
    private final String SLASH_REG = "//";

    public String[] regularSplitString(String factor, String message) {
        if (factor.contains(message)) {
            return factor.split(message);
        }
        return factor.split(INPUT_REG);

    }

    public String checkStartString(String factor) {
        if (factor.startsWith(SLASH_REG)) {
            return factor.substring(factor.indexOf("n")+1);
        }
        return factor;
    }

    public String subStringMessage(String factor) {
        if(factor.startsWith(SLASH_REG)){
            return factor.substring(2, 3);
        }
        return INPUT_REG;
    }

    public int[] changeStringToInt(String[] factor) {
        int[] intNumberFactor = new int[factor.length];
        for (int i = 0; i < factor.length; i++) {
            intNumberFactor[i] = Integer.parseInt(factor[i]);
        }
        return intNumberFactor;
    }

    public List<Integer> numberList(int[] numbers){
        List<Integer> numbersList = new ArrayList<>();
        changeList(numbers, numbersList);
        return validateEmptyException(numbersList);
    }

    private void changeList(int[] numbers, List<Integer> numbersList) {
        for (int number : numbers) {
            numbersList.add(number);
        }
    }

    public int add(List<Integer> list){
        return list.stream().mapToInt(i->i).sum();
    }

    private List<Integer> validateEmptyException(List<Integer> numberList){
        if(numberList.stream().anyMatch(num -> num < 0)){
            throw new RuntimeException();
        }
        return numberList;
    }

}

