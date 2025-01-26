import Lotto.domain.LottoNumber;
import Lotto.domain.RandomLottoNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("랜덤 숫자 생성 테스트")
public class RandomNumberTest {

    @DisplayName("랜덤 숫자 생성 개수 테스트")
    @Test
    void generateRandomNumber(){
        RandomLottoNumber randomLottoNumber = new RandomLottoNumber();
        final List< LottoNumber> lottoNumber = randomLottoNumber.generateNumberList();

        final int actualSize = lottoNumber.size();
        final int expectedSize = 6;

        assertEquals(expectedSize, actualSize);
    }

    @DisplayName("랜덤 숫자 생성 범위 테스트")
    @Test
    void validRangeOfRandomNumber(){
        RandomLottoNumber randomLottoNumber = new RandomLottoNumber();

        assertDoesNotThrow(()->{
            final List< LottoNumber> lottoNumber = randomLottoNumber.generateNumberList();
        });
    }

    @DisplayName("랜덤 숫자 생성 범위 실패 테스트")
    @Test
    void invalidRangeOfRandomNumber(){
        assertThrows(IllegalArgumentException.class, this::outOfRangeLotto);
    }

    private void outOfRangeLotto(){
        LottoNumber lottoNumber = new LottoNumber(46);
    }

}
