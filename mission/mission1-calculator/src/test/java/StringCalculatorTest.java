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

    @Test
    @DisplayName("사용자 정의 문자열 계산기 테스트")
    public void asserUserDefinedCalculator(){
        final StringCalculator StringCal = new StringCalculator("//;\n1;2;3");
        List<String> StringList = StringCal.stringList();
        List<String> expectedList = Arrays.asList("1","2","3");

        assertEquals(StringList, expectedList);
    }

    @Test
    @DisplayName("문자열 to 숫자 테스트")
    void assertStringToNum(){
        final StringCalculator StringCal = new StringCalculator("//;\n1;2;3");
        List<String> str = StringCal.stringList();
        List<Integer> NumCalculator = StringCal.StringToNum(str);

        List<Integer> expectedList = Arrays.asList(1,2,3);

        assertEquals(NumCalculator, expectedList);
    }

    @Test
    @DisplayName("숫자형 리스트 더하기 테스트")
    void asserAdd(){
        final StringCalculator StringCal = new StringCalculator("//;\n1;2;3");
        List<String> str = StringCal.stringList();
        List<Integer> NumCalculator = StringCal.StringToNum(str);
        final int result;
        result = StringCal.addNum(NumCalculator);
        final int expected = 6;

        assertEquals(result, expected);
    }
}
