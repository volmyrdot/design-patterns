package com.gmail.volmyrdot.design_pattern.creational.factory_method;

import java.math.BigDecimal;

/**
 * Implementation of {@link Creator} for creating a {@link Computer}.
 */
public final class ComputerCreator implements Creator {

  @Override
  public Product createProduct(BigDecimal price) {
    return new Computer(price);
  }
}
