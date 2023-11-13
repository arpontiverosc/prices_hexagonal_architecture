package com.inditex.prices;

import com.inditex.prices.model.Price;
import com.inditex.prices.objectmother.PriceCriteriaMother;
import com.inditex.prices.objectmother.PriceMother;
import com.inditex.prices.objectmother.SearchPriceQueryMother;
import com.inditex.prices.port.in.SearchPricesUseCase;
import com.inditex.prices.service.PriceService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@SpringBootTest(classes = PriceUseCaseTestConfiguration.class)
public class SearchPricesUseCaseImplTest {

    @Autowired
    private SearchPricesUseCase searchPricesUseCase;

    @Autowired
    private PriceService priceService;

    @Test
    public void executeRetrievePriceTest() {

        Mockito.when(priceService.retrievePrice(PriceCriteriaMother.create())).thenReturn(PriceMother.create());

        Price priceResult = searchPricesUseCase.execute(SearchPriceQueryMother.create());

        assertEquals(priceResult, PriceMother.create());

    }


}
