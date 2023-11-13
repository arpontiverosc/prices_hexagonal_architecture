package com.inditex.prices.objectmother;

import com.inditex.prices.model.Price;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PriceMother {

    public static Price create(){
        return Price.Builder.builder()
                            .id(1L)
                            .priceIdList(1L)
                            .price("20€")
                            .startDate(LocalDateTime.of(2023, 11, 13, 11, 30))
                            .endDate(LocalDateTime.of(2023, 11, 13, 12, 30))
                            .brandId(1L)
                            .build();
    }
}
