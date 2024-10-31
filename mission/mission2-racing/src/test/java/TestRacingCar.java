import com.racingcar.domain.RacingCarLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
