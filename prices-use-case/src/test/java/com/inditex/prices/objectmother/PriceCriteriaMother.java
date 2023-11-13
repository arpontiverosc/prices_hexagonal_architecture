package com.inditex.prices.objectmother;

import com.inditex.prices.port.out.model.PriceCriteria;

import java.time.LocalDateTime;

public class PriceCriteriaMother {

    public static PriceCriteria create() {
        return PriceCriteria.Builder.builder()
                .priceDate(LocalDateTime.of(2023, 11, 13, 12, 30))
                .brandId(1L)
                .productId(2L)
                .build();
    }
}
