package com.inditex.prices.port.out;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.out.model.PriceCriteria;

import java.util.Optional;

public interface SearchPriceRepository {
    Optional<Price> findPrice(PriceCriteria criteria);
}
