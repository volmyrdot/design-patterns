package com.gmail.volmyrdot.design_pattern.creational.abstract_factory;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Table implementation of {@link Product}.
 */
class Table implements Product {

  private final BigDecimal price;

  public Table(BigDecimal price) {
    this.price = price;
  }

  @Override
  public String getName() {
    return "Table";
  }

  @Override
  public BigDecimal getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Table)) {
      return false;
    }
    Table table = (Table) o;
    return Objects.equals(price, table.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price);
  }

  @Override
  public String toString() {
    return "Table{" +
        "price=" + price +
        '}';
  }
}
