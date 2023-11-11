package com.inditex.prices.in.rest.v1.model.response;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PriceDetailResponse {

    private Long productId;
    private Long brandId;
    private Long priceIdList;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String price;

}
