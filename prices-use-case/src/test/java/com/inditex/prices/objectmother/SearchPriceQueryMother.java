package com.inditex.prices.objectmother;

import com.inditex.prices.port.in.model.SearchPriceQuery;

import java.time.LocalDateTime;

public class SearchPriceQueryMother {

    public static SearchPriceQuery create(){
        return SearchPriceQuery.Builder.builder()
                .priceDate(LocalDateTime.of(2023, 11, 13, 12, 30))
                .brandId(1L)
                .productId(2L)
                .build();
    }
}
