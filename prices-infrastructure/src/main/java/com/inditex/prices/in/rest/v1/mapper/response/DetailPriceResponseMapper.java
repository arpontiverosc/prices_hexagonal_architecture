package com.inditex.prices.in.rest.v1.mapper.response;

import com.inditex.prices.in.rest.v1.model.response.PriceDetailResponse;
import com.inditex.prices.model.Price;

public class DetailPriceResponseMapper {
    public static PriceDetailResponse from(Price price) {
        return PriceDetailResponse.builder()
                .price(price.getPrice())
                .priceIdList(price.getPriceIdList())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .brandId(price.getBrandId())
                .productId(price.getProductId())
                .build();
    }
}
