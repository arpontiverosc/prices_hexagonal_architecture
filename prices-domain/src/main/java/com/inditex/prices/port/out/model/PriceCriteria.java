package com.inditex.prices.port.out.model;

import java.time.LocalDateTime;

public class PriceCriteria {

    private final LocalDateTime priceDate;
    private final Long productId;
    private final Long brandId;

    private PriceCriteria(LocalDateTime priceDate, Long productId, Long brandId) {
        this.priceDate = priceDate;
        this.productId = productId;
        this.brandId = brandId;
    }

    private PriceCriteria(Builder builder) {
        priceDate = builder.priceDate;
        productId = builder.productId;
        brandId = builder.brandId;
    }

    public LocalDateTime getPriceDate() {
        return priceDate;
    }

    public Long getProductId() {
        return productId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public static final class Builder {
        private LocalDateTime priceDate;
        private Long productId;
        private Long brandId;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder priceDate(LocalDateTime val) {
            priceDate = val;
            return this;
        }

        public Builder productId(Long val) {
            productId = val;
            return this;
        }

        public Builder brandId(Long val) {
            brandId = val;
            return this;
        }

        public PriceCriteria build() {
            return new PriceCriteria(this);
        }
    }
}
