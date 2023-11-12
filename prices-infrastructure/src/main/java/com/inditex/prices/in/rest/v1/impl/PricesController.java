package com.inditex.prices.in.rest.v1.impl;


import com.inditex.prices.in.rest.v1.PricesApi;
import com.inditex.prices.in.rest.v1.mapper.query.DetailPriceQueryMapper;
import com.inditex.prices.in.rest.v1.mapper.response.DetailPriceResponseMapper;
import com.inditex.prices.in.rest.v1.model.response.PriceDetailResponse;
import com.inditex.prices.port.in.SearchPricesUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@AllArgsConstructor
public class PricesController implements PricesApi {

    private final SearchPricesUseCase searchPricesUseCase;

    @Override
    public PriceDetailResponse findPricesBy(LocalDateTime priceDate, Long productId, Long brandId) {
        return DetailPriceResponseMapper.from(searchPricesUseCase.execute(DetailPriceQueryMapper.from(priceDate, productId, brandId)));
    }
}
