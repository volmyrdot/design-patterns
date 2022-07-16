package com.gmail.volmyrdot.design_pattern.creational.factory_method;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

/**
 * Tests for Factory Method design pattern.
 */
class FactoryMethodTest {

  private Creator creator;

  @Test
  void shouldCreateComputer() {
    BigDecimal price = BigDecimal.valueOf(1000.0);
    creator = new ComputerCreator();

    assertThat(creator.createProduct(price)).isEqualTo(new Computer(price));
  }

  @Test
  void shouldCreateTable() {
    BigDecimal price = BigDecimal.valueOf(1000.0);
    creator = new TableCreator();

    assertThat(creator.createProduct(price)).isEqualTo(new Table(price));
  }
}
