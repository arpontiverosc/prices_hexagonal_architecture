package com.inditex.prices;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.in.SearchPricesUseCase;
import com.inditex.prices.port.in.model.SearchPriceQuery;
import com.inditex.prices.port.out.model.PriceCriteria;
import com.inditex.prices.service.PricesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SearchPricesUseCaseImpl implements SearchPricesUseCase {


    private final PricesService pricesService;
    @Transactional
    @Override
    public Price execute(SearchPriceQuery query) {
        PriceCriteria criteria = PriceCriteria.Builder.builder()
                .priceDate(query.getPriceDate())
                .brandId(query.getBrandId())
                .productId(query.getProductId())
                .build();
        return pricesService.retrievePrice(criteria);
    }
}
