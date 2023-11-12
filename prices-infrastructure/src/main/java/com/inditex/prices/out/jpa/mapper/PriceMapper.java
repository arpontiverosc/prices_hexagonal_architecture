package com.inditex.prices.out.jpa.mapper;

import com.inditex.prices.model.Price;
import com.inditex.prices.out.jpa.model.PriceEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PriceMapper {

    public static Price from(PriceEntity priceEntity){
        return Price.Builder.builder()
                .id(priceEntity.getId())
                .brandId(priceEntity.getBrandId())
                .productId(priceEntity.getProductId())
                .price(priceEntity.getPrice()+priceEntity.getCurr())
                .startDate(priceEntity.getStartDate())
                .endDate(priceEntity.getEndDate())
                .build();
    }
}
