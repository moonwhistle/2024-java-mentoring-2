package Lotto.domain;

import Lotto.view.InputView;
import randomNumber.RandomNumberGenerator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoGenerator {

    private final RandomNumberGenerator randomNumberGenerator;

    public LottoGenerator(final RandomNumberGenerator randomNumberGenerator){
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public List<LottoNumber> addManualLotto(String userLotto) {
        List<LottoNumber> lottoNumbers = createManualLotto(userLotto);

        return lottoNumbers;
    }

    public Lottos createManualLottos(List<String> manualLotto, int inputPrice){
        return new Lottos.Builder().
                inputPrice(inputPrice).
                lottoGenerator(this).
                addManualLotto(manualLotto)
                .addAutoLotto()
                .build();
    }

    public List<LottoNumber> addAutoLotto() {
        return createAutoLotto();
    }

    public List<String> enterUserLotto(int manualLottoNumber){
        return IntStream.range(0, manualLottoNumber)
                .mapToObj(i -> InputView.enterManualLotto())
                .collect(Collectors.toList());
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
