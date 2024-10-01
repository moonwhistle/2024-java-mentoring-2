package domain;

public class Calculator {

    public static final int EXCEPTION_ZERO = 0;
    public static final String ERROR_OUTPUT = "0으로 나눌 수 없습니다";

    public int add(int firstNumber, int secondNumber) {
        return plus(firstNumber, secondNumber);
    }

    private int plus(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return minus(firstNumber, secondNumber);
    }

    private int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return product(firstNumber, secondNumber);
    }

    private int product(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return quotient(firstNumber, secondNumber);
    }

    private int quotient(int firstNumber, int secondNumber) {
        if (secondNumber == EXCEPTION_ZERO) {
            throw new ArithmeticException(ERROR_OUTPUT);
        }
        return firstNumber / secondNumber;
    }

}
