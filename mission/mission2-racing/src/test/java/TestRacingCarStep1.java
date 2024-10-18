import com.racingcar.domain.RacingCarLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestRacingCarStep1 {
    @Test
    public void testParseInt() {

        //given
        String text = "12";
        int expected = 12;

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();
        int result = racingCarLogic.parseStringTryCount(text);

        //then
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testErrorParseInt() {

        //given
        String text = "string";
        String expectedErrorMessage = "문자열을 숫자로 변경할 수 없습니다.";

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        RuntimeException thrown = Assertions.assertThrows(
                RuntimeException.class,
                () -> racingCarLogic.parseStringTryCount(text)
        );

        //then
        Assertions.assertEquals(expectedErrorMessage, thrown.getMessage());
    }

    @Test
    public void testProcessCarMove() {

        //given
        List<Integer> zeroToNineList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            zeroToNineList.add(i);
        }

        String expected = "------";

        //when
        RacingCarLogic racingCarLogic = new RacingCarLogic();

        StringBuilder intialString = new StringBuilder();
        for(int num : zeroToNineList){
            String stringValue = racingCarLogic.processCarMove(num);
            intialString.append(stringValue);
        }
        String result = intialString.toString();

        //then
        Assertions.assertEquals(result, expected);
    }
}
