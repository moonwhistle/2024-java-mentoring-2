package com.lotto.domain.vo;

import com.lotto.domain.LottoPrizeCalculator;
import com.lotto.domain.generator.LottoResult;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public record LottoResults(List<LottoResult> results) {

    public LottoResults(List<LottoResult> results) {
        this.results = Collections.unmodifiableList(results);
    }

    public MatchCountInfo getMatchCountInfo() {
        return new MatchCountInfo(results.stream()
                .collect(Collectors.groupingBy(
                        LottoResult::getMatchCount,
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)
                )));
    }

    public int getTotalPrize() {
        return results.stream()
                .mapToInt(v -> LottoPrizeCalculator.getPrize(v.getMatchCount(), v.hasBonus()))
                .sum();
    }

}
