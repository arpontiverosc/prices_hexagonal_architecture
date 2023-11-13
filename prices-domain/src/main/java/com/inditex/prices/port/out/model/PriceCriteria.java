package com.inditex.prices.port.out.model;

import java.time.LocalDateTime;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceCriteria that = (PriceCriteria) o;
        return Objects.equals(getPriceDate(), that.getPriceDate()) && Objects.equals(getProductId(), that.getProductId()) && Objects.equals(getBrandId(), that.getBrandId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPriceDate(), getProductId(), getBrandId());
    }
}
