package com.inditex.prices.model;

import java.time.LocalDateTime;

public class Price {

    private Long id;
    private Long productId;
    private Long brandId;
    private Long priceIdList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String price;

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public Long getPriceIdList() {
        return priceIdList;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getPrice() {
        return price;
    }
}
