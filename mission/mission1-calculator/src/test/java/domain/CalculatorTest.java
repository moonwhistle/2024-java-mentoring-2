package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("덧셈 테스트")
    void 덧셈_테스트() {

        //given
        Calculator calculator = new Calculator();
        int firstNumber = 1;
        int secondNumber = 2;
        int expected = 3;

        //when
        int result = calculator.add(firstNumber, secondNumber);

        //then
        assertEquals(expected, result);
    }

}
