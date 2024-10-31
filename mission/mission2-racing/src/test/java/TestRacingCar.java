import com.racingcar.domain.RacingCarLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRacingCar {
    @Test
    public void testCarMove1() {

        //given
        int test = 4;
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
    public void testCarMove2() {

        //given
        int test = 0;
        String expected = "stop";
        String notExpected = "move";

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        String result = racingCarLogic.isCarMoved(test);

        //then
        Assertions.assertEquals(result, expected);
        Assertions.assertNotEquals(result, notExpected);
    }
}
