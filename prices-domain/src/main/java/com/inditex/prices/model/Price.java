package com.inditex.prices.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Price {

    private Long id;
    private Long productId;
    private Long brandId;
    private Long priceIdList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String price;

    private Price(Builder builder) {
        id = builder.id;
        productId = builder.productId;
        brandId = builder.brandId;
        priceIdList = builder.priceIdList;
        startDate = builder.startDate;
        endDate = builder.endDate;
        price = builder.price;
    }

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


    public static final class Builder {
        private Long id;
        private Long productId;
        private Long brandId;
        private Long priceIdList;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private String price;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder id(Long val) {
            id = val;
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

        public Builder priceIdList(Long val) {
            priceIdList = val;
            return this;
        }

        public Builder startDate(LocalDateTime val) {
            startDate = val;
            return this;
        }

        public Builder endDate(LocalDateTime val) {
            endDate = val;
            return this;
        }

        public Builder price(String val) {
            price = val;
            return this;
        }

        public Price build() {
            return new Price(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price = (Price) o;
        return Objects.equals(getId(), price.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
