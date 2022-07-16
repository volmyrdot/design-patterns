package com.gmail.volmyrdot.design_pattern.creational.factory_method;

import java.math.BigDecimal;

/**
 * The Creator class declares the factory method that returns new product objects.
 */
interface Creator {

  Product createProduct(BigDecimal price);
}
