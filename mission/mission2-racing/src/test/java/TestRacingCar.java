import com.racingcar.domain.RacingCarLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRacingCar {
    @Test
    public void testCarMove1() {

        //given
        int test = 4;
        int expected = 1;
        int notExpected = 0;

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        int result = racingCarLogic.isCarMoved(test);

        //then
        Assertions.assertEquals(result, expected);
        Assertions.assertNotEquals(result, notExpected);
    }

    @Test
    public void testCarMove2() {

        //given
        int test = 0;
        int expected = 0;
        int notExpected = 1;

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        int result = racingCarLogic.isCarMoved(test);

        //then
        Assertions.assertEquals(result, expected);
        Assertions.assertNotEquals(result, notExpected);
    }
}
