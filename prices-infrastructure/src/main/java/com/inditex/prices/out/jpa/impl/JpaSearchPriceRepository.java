package com.inditex.prices.out.jpa.impl;

import com.inditex.prices.model.Price;
import com.inditex.prices.out.jpa.SpringDataPriceRepository;
import com.inditex.prices.out.jpa.mapper.PriceMapper;
import com.inditex.prices.out.jpa.model.PriceEntity;
import com.inditex.prices.port.out.SearchPriceRepository;
import com.inditex.prices.port.out.model.PriceCriteria;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class JpaSearchPriceRepository implements SearchPriceRepository  {

    private final SpringDataPriceRepository springDataPriceRepository;
    private final PricesSpecification priceSpecification;
    @Override
    public Optional<Price> findPrice(PriceCriteria criteria) {
        List<PriceEntity> priceEntities = springDataPriceRepository.findAll(priceSpecification.getPrices(criteria));
        return priceEntities.stream().findFirst().map(PriceMapper::from);
    }
}
