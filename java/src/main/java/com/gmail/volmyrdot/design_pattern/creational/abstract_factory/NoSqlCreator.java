package com.gmail.volmyrdot.design_pattern.creational.abstract_factory;

import java.math.BigDecimal;

/**
 * Implementation of {@link AbstractFactory} for creating for noSQL storage.
 */
final class NoSqlCreator implements AbstractFactory {

  @Override
  public Computer createComputer(BigDecimal price) {
    return new Computer(price);
  }

  @Override
  public Table createTable(BigDecimal price) {
    return new Table(price);
  }
}
