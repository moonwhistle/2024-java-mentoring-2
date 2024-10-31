package com.racing.dto;

import com.racing.domain.Car;
import com.racing.domain.GenerateRandom;
import com.racing.domain.Name;

import java.util.List;

public class CarsDto {

    private final Name carName;
    private final GenerateRandom generateRandom;

    public CarsDto(Name carName, GenerateRandom generateRandom){
        this.carName = carName;
        this.generateRandom = generateRandom;
    }

    public Name getCarName(){
        return carName;
    }

    public GenerateRandom getGenerateRandom(){
        return generateRandom;
    }

}
