package com.calculator.domain;

public class StringSeparator {
    public String[] separatedEquation(String equations) {
        String[] result = equations.split("[,:]");
        return result;
    }
}
