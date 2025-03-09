package com.lotto.service.DTO;

import com.lotto.domain.vo.MatchCountInfo;

public record WinningStatisticsResponseDTO(MatchCountInfo matchCountInfo, String ROI) {
}