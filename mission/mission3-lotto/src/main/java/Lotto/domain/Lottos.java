package Lotto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lottos {

    private List<Lotto> lottos;

    public Lottos(List<Lotto> lottos){
        this.lottos = lottos;
    }

    public List<Lotto> getLottos(){
        return new ArrayList<>(lottos);
    }

    public String printLottoList(){
        return getLottos().stream()
                .map(lotto -> lotto.getLotto().toString())
                .collect(Collectors.joining("\n"));
    }

}
