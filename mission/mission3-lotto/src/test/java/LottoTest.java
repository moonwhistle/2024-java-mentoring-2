import Lotto.domain.Lotto;
import Lotto.domain.LottoNumber;

import Lotto.domain.RandomLottoNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import randomNumber.RandomNumberGenerator;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@DisplayName("로또 테스트")
@ExtendWith(MockitoExtension.class)
public class LottoTest {

    @Mock
    private RandomLottoNumber randomLottoNumber;

    @InjectMocks
    private Lotto lotto;

    @DisplayName("로또 생성 테스트")
    @Test
    void testCreateLotto(){
        when(randomLottoNumber.generateNumberList()).thenReturn(
                List.of(new LottoNumber(1), new LottoNumber(2), new LottoNumber(3),
                        new LottoNumber(4), new LottoNumber(5), new LottoNumber(6))
        );

        List<LottoNumber> generatedLotto = lotto.getLotto();
        final int size = 6;

        assertEquals(size, generatedLotto.size());
        assertNotNull(generatedLotto);
    }

    @DisplayName("로또 생성 실패 테스트")
    @Test
    void testFailureCreateLotto(){

    }

}
