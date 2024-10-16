package com.calculator;

import com.calculator.controller.StringCalculatorController;

public class CalculatorApplication {

    public static void main(String[] args) {

        StringCalculatorController stringCalculatorController = new StringCalculatorController();
        stringCalculatorController.processStringCalculator();
    }
}
