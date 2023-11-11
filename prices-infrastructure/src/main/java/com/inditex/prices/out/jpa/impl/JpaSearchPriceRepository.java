package com.inditex.prices.out.jpa.impl;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.out.SearchPriceRepository;
import com.inditex.prices.port.out.model.PriceCriteria;

public class JpaSearchPriceRepository implements SearchPriceRepository  {
    @Override
    public Price findPrice(PriceCriteria criteria) {
        return null;
    }
}
