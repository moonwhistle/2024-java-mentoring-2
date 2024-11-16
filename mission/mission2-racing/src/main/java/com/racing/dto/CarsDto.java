package com.racing.dto;

import com.racing.domain.GenerateRandom;
import com.racing.domain.Name;

public record CarsDto(Name carName, GenerateRandom generateRandom) {}

