package Lotto.domain;

import Lotto.common.exception.ExceptionMessage;
import Lotto.util.LottoValidator;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lottos {

    private final List<Lotto> lottos;
    private final int inputPrice;
    private final RandomNumberGenerator randomNumberGenerator;

    public static class Builder{
        int inputPrice;
        RandomNumberGenerator randomNumberGenerator;
        List<Lotto> lottos = new ArrayList<>();

        public Builder inputPrice(int inputPrice){
            this.inputPrice = inputPrice;
            LottoValidator.validateLottos(inputPrice);
            return this;
        }

        public Builder randomNumberGenerator(RandomNumberGenerator randomNumberGenerator){
            this.randomNumberGenerator = randomNumberGenerator;
            return this;
        }

        public Builder addManualLotto(String userLotto) {
            List<LottoNumber> lottoNumbers = createManualLotto(userLotto);

            this.lottos.add(new Lotto.Builder().lotto(lottoNumbers).build());
            return this;
        }

        public Builder addAutoLotto() {
            int autoLottoCount = (inputPrice / Lotto.lottoPrice) - lottos.size();

            for (int i = 0; i < autoLottoCount; i++) {
                this.lottos.add(new Lotto.Builder()
                        .randomNumberGenerator(randomNumberGenerator)
                        .lotto(createAutoLotto())
                        .build());
            }
            return this;
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

        public Lottos build(){
            return new Lottos(this);
        }

    }

    private Lottos(Builder builder){
        this.inputPrice = builder.inputPrice;
        this.randomNumberGenerator = builder.randomNumberGenerator;
        this.lottos = builder.lottos;
    }

    public List<Lotto> getLottos(){
        return new ArrayList<>(lottos);
    }

    public int getInputPrice(){
        return inputPrice;
    }

    public int getNumberOfLottos(){
        return inputPrice / Lotto.lottoPrice;
    }

    public String printLottoList(){
        return lottos.stream()
                .map(Lotto::toString)
                .collect(Collectors.joining("\n"));
    }

}
