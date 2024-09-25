package domain;

public class Calculator {

    public int add(int Number1, int Number2) {
        return plus(Number1, Number2);
    }

    private static int plus(int Number1, int Number2) {
        return Number1 + Number2;
    }

    public int subtract(int Number1, int Number2) {
        return minus(Number1, Number2);
    }

    private static int minus(int Number1, int Number2) {
        if (Number1 < Number2) {
            throw new ArithmeticException("음수를 반환 할 수 없습니다.");
        }
        return Number1 - Number2;
    }

    public int multiplication(int Number1, int Number2) {
        return product(Number1, Number2);
    }

    private int product(int Number1, int Number2) {
        return Number1 * Number2;
    }

    public int divide(int Number1, int Number2) {
        return quotient(Number1, Number2);
    }

    private int quotient(int Number1, int Number2) {
        if (Number2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return Number1 / Number2;
    }
}
