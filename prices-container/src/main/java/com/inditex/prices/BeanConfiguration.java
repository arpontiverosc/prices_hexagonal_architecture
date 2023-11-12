package com.inditex.prices;

import com.inditex.prices.port.out.SearchPriceRepository;
import com.inditex.prices.service.PriceService;
import com.inditex.prices.service.PriceServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public PriceService pricesService(SearchPriceRepository searchPriceRepository) {
        return new PriceServiceImpl(searchPriceRepository);
    }
}
