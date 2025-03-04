package Lotto.domain;

import Lotto.util.LottoValidator;
import randomNumber.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Lottos {

    private final List<Lotto> lottos;
    private final int inputPrice;
    private final LottoGenerator lottoGenerator;

    public static class Builder{
        private int inputPrice;
        private LottoGenerator lottoGenerator;
        private List<Lotto> lottos = new ArrayList<>();

        public Builder inputPrice(int inputPrice){
            this.inputPrice = inputPrice;
            return this;
        }

        public Builder lottoGenerator(LottoGenerator lottoGenerator){
            this.lottoGenerator = lottoGenerator;
            return this;
        }

        public Builder addManualLotto(String userLotto, int manualLottoNumber) {
            for(int i = 0; i < manualLottoNumber; i++) {
                List<LottoNumber> manualLotto = lottoGenerator.addManualLotto(userLotto);
                this.lottos.add(new Lotto.Builder().lotto(manualLotto).build());
            }
            return this;
        }

        public Builder addAutoLotto() {
            int autoLottoCount = (inputPrice / Lotto.lottoPrice) - lottos.size();

            for (int i = 0; i < autoLottoCount; i++) {
                this.lottos.add(new Lotto.Builder()
                        .lotto(lottoGenerator.addAutoLotto())
                        .build());
            }
            return this;
        }

        public Lottos build(){
            return new Lottos(this);
        }

    }

    private Lottos(Builder builder){
        this.inputPrice = builder.inputPrice;
        LottoValidator.validateLottos(inputPrice);
        this.lottoGenerator = builder.lottoGenerator;
        this.lottos = new ArrayList<>(builder.lottos);
    }

    public List<Lotto> getLottos(){
        return Collections.unmodifiableList(lottos);
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
