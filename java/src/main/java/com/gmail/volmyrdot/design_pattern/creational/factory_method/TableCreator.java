package com.gmail.volmyrdot.design_pattern.creational.factory_method;

import java.math.BigDecimal;

/**
 * Implementation of {@link Creator} for creating a {@link Table}.
 */
public final class TableCreator implements Creator {

  @Override
  public Product createProduct(BigDecimal price) {
    return new Table(price);
  }
}
