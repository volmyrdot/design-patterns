package com.gmail.volmyrdot.design_pattern.creational.abstract_factory;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Computer implementation of {@link Product}.
 */
final class Computer implements Product {

  private final BigDecimal price;

  public Computer(BigDecimal price) {
    this.price = price;
  }

  @Override
  public String getName() {
    return "Computer";
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
    if (!(o instanceof Computer)) {
      return false;
    }
    Computer computer = (Computer) o;
    return Objects.equals(price, computer.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price);
  }

  @Override
  public String toString() {
    return "Computer{" +
        "price=" + price +
        '}';
  }
}
