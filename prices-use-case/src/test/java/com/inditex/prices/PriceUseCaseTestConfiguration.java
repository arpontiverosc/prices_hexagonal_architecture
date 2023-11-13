package com.inditex.prices;


import com.inditex.prices.service.PriceService;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.inditex.prices")
public class PriceUseCaseTestConfiguration {


    @Bean
    public PriceService priceService() {
        return Mockito.mock(PriceService.class);
    }


}
