package com.inditex.prices.service;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.in.model.SearchPriceQuery;
import com.inditex.prices.port.out.SearchPriceRepository;
import com.inditex.prices.port.out.model.PriceCriteria;

public class PricesService {

    private final SearchPriceRepository searchPriceRepository;

    public PricesService(SearchPriceRepository searchPriceRepository) {
        this.searchPriceRepository = searchPriceRepository;
    }

    public Price retrievePrice(PriceCriteria criteria) {
            return  searchPriceRepository.findPrice(criteria);
    }
}
