package com.inditex.prices.in.rest.v1.mapper.query;


import com.inditex.prices.port.in.model.SearchPriceQuery;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DetailPriceQueryMapper {

    public static SearchPriceQuery from(LocalDateTime priceDate, Long productId, Long brandId){
        return SearchPriceQuery.Builder.builder()
                        .priceDate(priceDate)
                        .productId(productId)
                        .brandId(brandId)
                        .build();
    }

}
