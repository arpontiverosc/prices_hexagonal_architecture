package com.inditex.prices.port.in;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.in.model.SearchPriceQuery;

public interface SearchPricesUseCase {
    Price execute(SearchPriceQuery from);
}
