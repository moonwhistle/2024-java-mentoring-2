package com.calculator.domain;

public class StringCalculator {
    public int[] StringToInt(String[] seperatedEquation) {
        int[] intArray = new int[seperatedEquation.length];
        for (int i = 0; i < seperatedEquation.length; i++) {
            intArray[i] = Integer.parseInt(seperatedEquation[i]);
        }
        return intArray;
    }

    public int addArray(int[] intArray){
        int lastIndex = intArray[intArray.length - 1];
        int totalSum = 0;
        for (int i = 0; i <= lastIndex; i++) {
            totalSum += intArray[i];
        }
        return totalSum;
    }
}
