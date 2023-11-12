package com.inditex.prices.service;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.out.model.PriceCriteria;

public interface PriceService {
    Price retrievePrice(PriceCriteria criteria);
}
