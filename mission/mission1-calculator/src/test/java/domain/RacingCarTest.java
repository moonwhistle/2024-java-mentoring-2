package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarTest {
    @Test
    @DisplayName("이동 테스트")
    void 이동_테스트() {

        //given

        RacingCar car = new RacingCar();
        int random =3;
        int expected =0;


        //when
        int result = car.moveCar(random);

        //then
        assertEquals(expected, result);
    }

}
