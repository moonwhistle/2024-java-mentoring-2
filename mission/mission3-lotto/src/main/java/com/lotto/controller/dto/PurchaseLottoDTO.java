package com.lotto.controller.dto;

import java.util.List;
import java.util.Set;

public record PurchaseLottoDTO(List<Set<Integer>> purchasedLotto) {
}
