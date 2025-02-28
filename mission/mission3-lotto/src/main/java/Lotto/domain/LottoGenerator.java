package Lotto.domain;

import randomNumber.RandomNumberGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LottoGenerator {

    private final RandomNumberGenerator randomNumberGenerator;

    public LottoGenerator(final RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public List<LottoNumber> addManualLotto(String userLotto) {
        List<LottoNumber> lottoNumbers = createManualLotto(userLotto);

        return lottoNumbers;
    }

    public List<LottoNumber> addAutoLotto() {
        return createAutoLotto();
    }

    private List<LottoNumber> createManualLotto(String userLotto){
        return Arrays.stream(userLotto.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .map(LottoNumber::new)
                .collect(Collectors.toList());
    }

    private List<LottoNumber> createAutoLotto(){
        return randomNumberGenerator.generateNumberList();
    }

}
