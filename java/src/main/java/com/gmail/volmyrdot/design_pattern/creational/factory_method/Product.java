package com.gmail.volmyrdot.design_pattern.creational.factory_method;

import java.math.BigDecimal;

/**
 * Basic interface for all products.
 */
public interface Product {

  /**
   * Returns the name of the product.
   */
  String getName();

  /**
   * Returns the price of the product.
   */
  BigDecimal getPrice();
}
