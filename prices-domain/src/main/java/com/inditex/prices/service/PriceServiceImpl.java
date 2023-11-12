package com.inditex.prices.service;

import com.inditex.prices.model.Price;
import com.inditex.prices.port.out.SearchPriceRepository;
import com.inditex.prices.port.out.model.PriceCriteria;

public class PriceServiceImpl implements PriceService {
    private final SearchPriceRepository searchPriceRepository;

    public PriceServiceImpl(SearchPriceRepository searchPriceRepository) {
        this.searchPriceRepository = searchPriceRepository;
    }

    @Override
    public Price retrievePrice(PriceCriteria criteria) {
        return searchPriceRepository.findPrice(criteria);
    }
}
