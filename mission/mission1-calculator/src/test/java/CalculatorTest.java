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
    
}

