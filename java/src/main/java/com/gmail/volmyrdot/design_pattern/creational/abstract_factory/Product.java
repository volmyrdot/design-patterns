package com.gmail.volmyrdot.design_pattern.creational.abstract_factory;

import java.math.BigDecimal;

/**
 * Basic interface for all products.
 */
interface Product {

  /**
   * Returns the name of the product.
   */
  String getName();

  /**
   * Returns the price of the product.
   */
  BigDecimal getPrice();
}
