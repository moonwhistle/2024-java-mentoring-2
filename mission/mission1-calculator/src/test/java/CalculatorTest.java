import com.calculator.domain.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculatorTest {
    @Test
    @DisplayName("계산기 더하기 메서드 테스트")
    public void testAdd(){
        Calculator calculator = new Calculator();
        final int num1 = 3;
        final int num2 = 4;

        final int expected = 7;
        final int result = calculator.add(num1, num2);

        assertEquals(result, expected);
    }

    @Test
    @DisplayName("계산기 빼기 메서드 테스트")
    public void testSubtract(){
        Calculator calculator = new Calculator();
        final int num1 = 7;
        final int num2 = 9;

        final int expected = -2;
        final int result = calculator.subtract(num1, num2);

        assertEquals(result, expected);
    }

    @Test
    @DisplayName("계산기 곱하기 메서드 테스트")
    public void testMulti(){
        Calculator calculator = new Calculator();
        final int num1 = 3;
        final int num2 = 4;

        final int expected = 12;
        final int result = calculator.multiple(num1, num2);

        assertEquals(result, expected);
    }

    @Test
    @DisplayName("계산기 나누기 메서드 실패 테스트")
    public void testDivideFail(){
        Calculator calculator = new Calculator();
        final int num1 = 3;
        final int num2 = 0;

        final var expected = "0으로 나눌 수 없음";
        final ArithmeticException arithmeticException = assertThrows(ArithmeticException.class, ()-> calculator.divide(num1,num2));
        assertEquals(arithmeticException.getMessage(), expected);
    }

    @Test
    @DisplayName("계산기 나누기 메서드 테스트")
    public void testDivide(){
        Calculator calculator = new Calculator();
        final int num1 = 10;
        final int num2 = 3;

        final int expected = 3;
        final int result = calculator.divide(num1, num2);

        assertEquals(result, expected);
    }
}

