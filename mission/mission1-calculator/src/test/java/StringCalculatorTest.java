import com.calculator.domain.StringCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    @DisplayName("문자열 테스트")
    public void asserStringCalculator(){
        final StringCalculator StringCal = new StringCalculator("1;2:4:3");
        List<String> StringList = StringCal.stringList();
        List<String> expectedList = Arrays.asList("1","2","4","3");

        assertEquals(StringList, expectedList);
    }
}
