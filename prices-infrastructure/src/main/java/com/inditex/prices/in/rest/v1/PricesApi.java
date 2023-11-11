package com.inditex.prices.in.rest.v1;

import com.inditex.prices.in.rest.v1.model.response.PriceDetailResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.List;

@RequestMapping("/prices")
public interface PricesApi {


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public PriceDetailResponse findPricesBy(
            @RequestParam(name="priceDate", required=false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime priceDate,
            @RequestParam(name="productId",required=false ) Long productId,
            @RequestParam(name="brandId",required=false ) Long brandId);




}
