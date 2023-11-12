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

@Repository
@RequiredArgsConstructor
public class JpaSearchPriceRepository implements SearchPriceRepository  {

    private final SpringDataPriceRepository springDataPriceRepository;
    private final PricesSpecification priceSpecification;
    @Override
    public Price findPrice(PriceCriteria criteria) {
        List<PriceEntity> priceEntities = springDataPriceRepository.findAll(priceSpecification.getPrices(criteria));
        PriceEntity priceEntity = priceEntities.stream().findFirst().get();
        return PriceMapper.from(priceEntity);
    }
}
