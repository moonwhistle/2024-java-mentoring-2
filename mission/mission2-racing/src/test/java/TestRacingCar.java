import com.racingcar.domain.IntegerParser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRacingCar {
    
    @Test
    public void notIntegerErrorTest() {

        //given
        String strNumber = "1.5";

        String expectedErrorMessage = "입력된 값이 정수가 아닙니다.";

        //when
        IntegerParser integerParser = new IntegerParser();

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> integerParser.parseTryCount(strNumber)
        );

        //then
        assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void minusErrorTest() {

        //given
        String strNumber = "-1";

        String expectedErrorMessage = "입력된 값이 음수입니다.";

        //when
        IntegerParser integerParser = new IntegerParser();

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> integerParser.parseTryCount(strNumber)
        );

        //then
        assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void parseIntTest() {

        //given
        String strNumber = "1";

        int expected = 1;

        //when
        IntegerParser integerParser = new IntegerParser();

        int result = integerParser.parseTryCount(strNumber);

        //then
        assertEquals(expected,result);
    }

    @Test
    public void parseStringNaNTest() {

        //given
        String strNumber = "ㅋㅋ루삥뽕빵빵뽕";

        String expectedErrorMessage = "입력된 값이 숫자가 아닙니다.";

        //when
        IntegerParser integerParser = new IntegerParser();

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> integerParser.parseTryCount(strNumber)
        );

        //then
        assertEquals(expectedErrorMessage, thrown.getMessage());
    }
}
