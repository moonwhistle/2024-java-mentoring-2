import com.calculator.domain.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStringCalculator{
    @Test
    public void testNormalResult() {

        //given
        String text = "1,2,3";
        int expected = 6;
        int notExpected = 10;

        //when
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.processInputValue(text);

        //then
        Assertions.assertAll(
                () -> assertEquals(expected, result),
                () -> assertNotEquals(notExpected, result)
        );
    }

    @Test
    public void testCustomSeperatorResult1() {

        //given
        String text = "//;\\n1,2;3;4";
        int expected = 10;
        int notExpected = 4;

        //when
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.processInputValue(text);

        //then
        Assertions.assertAll(
                () -> assertEquals(expected, result),
                () -> assertNotEquals(notExpected, result)
        );
    }

    @Test
    public void testCustomSeperatorResult2() {

        //given
        String text = "//!\\n1!2!3!4!5!6";
        int expected = 21;
        int notExpected = 20;

        //when
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.processInputValue(text);

        //then
        Assertions.assertAll(
                () -> assertEquals(expected, result),
                () -> assertNotEquals(notExpected, result)
        );
    }

    @Test
    public void minusErrorTest() {

        //given
        String text = "//!\\n1!2!3!-4";
        String expectedErrorMessage = "음수입니다.";

        //when
        StringCalculator stringCalculator = new StringCalculator();
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> stringCalculator.processInputValue(text)
        );

        //then
        assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void speratorErrorTest() {

        //given
        String text = "//;\\n1!2!3!4";
        String expectedErrorMessage = "확인되지 않은 구분자입니다.";

        //when
        StringCalculator stringCalculator = new StringCalculator();
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> stringCalculator.processInputValue(text)
        );

        //then
        assertEquals(expectedErrorMessage, thrown.getMessage());
    }
}
