package com.gmail.volmyrdot.design_pattern.creational.abstract_factory;

import java.math.BigDecimal;

/**
 * The Abstract Factory interface declares a set of methods for creating each of the abstract
 * products.
 */
interface AbstractFactory {

  Computer createComputer(BigDecimal price);

  Table createTable(BigDecimal price);
}
