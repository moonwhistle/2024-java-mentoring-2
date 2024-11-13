import com.racingcar.domain.RacingCarLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRacingCar {
    @Test
    public void testMoveState() {

        //given
        int test = 4;
        int expected = 1;
        int notExpected = 0;

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        int result = racingCarLogic.getCarMoveState(test);

        //then
        Assertions.assertEquals(result, expected);
        Assertions.assertNotEquals(result, notExpected);
    }

    @Test
    public void testCarMove() {

        //given
        int test = 1;
        String expected = "move";
        String notExpected = "stop";

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        String result = racingCarLogic.isCarMoved(test);

        //then
        Assertions.assertEquals(result, expected);
        Assertions.assertNotEquals(result, notExpected);
    }

    @Test
    public void notIntegerErrorTest() {

        //given
        String strNumber = "1.5";

        String expectedErrorMessage = "입력된 값이 정수가 아닙니다.";

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> racingCarLogic.parseTryCount(strNumber)
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
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> racingCarLogic.parseTryCount(strNumber)
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
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        int result = racingCarLogic.parseTryCount(strNumber);

        //then
        assertEquals(expected,result);
    }
}
