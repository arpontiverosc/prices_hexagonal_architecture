package com.inditex.prices.port.out;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.out.model.PriceCriteria;

public interface SearchPriceRepository {
    Price findPrice(PriceCriteria criteria);
}
