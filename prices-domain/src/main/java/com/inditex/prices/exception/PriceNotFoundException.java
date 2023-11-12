package com.inditex.prices.exception;


import com.inditex.prices.util.PriceErrorCode;

public class PriceNotFoundException extends NotFoundException {

  public PriceNotFoundException() {
    super(PriceErrorCode.NOT_FOUND);
  }
}
