package com.lotto.controller.dto;

import com.lotto.domain.vo.Lotto;

import java.util.List;

public record PurchaseLottoDTO(List<Lotto> purchasedLotto) {
}
