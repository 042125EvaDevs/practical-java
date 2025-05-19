package com.evaitcs.notes.calculator;

import org.junit.jupiter.api.*;

class CalculatorTest {


  private Calculator calculator;

  @BeforeEach
  void setup() {
    calculator = new Calculator();
  }

  @AfterEach
  void tearDown() {
    calculator = null;
  }

  @Test
  void addShouldReturnCorrectValue() {
    int result = calculator.add(10, 25);

    Assertions.assertEquals(35, result);
  }

  @Test
  @DisplayName("should divide")
  void divideSuccess() {
    double result = calculator.divide(10, 2);

    Assertions.assertEquals(5, result);
  }


  @Test
  @DisplayName("divide by zero should return zero")
  void divideZeroAsDenominatorReturns0() {
    /* GIVEN - zero as denominator */


    /* WHEN - divide */
    double result = calculator.divide(17, 0);

    /* THEN - returns 0 */
    Assertions.assertEquals(0, result);

  }

  @Test
  @DisplayName("divide by zero should throw exception")
  void divideZeroAsDenominatorThrows() {
    /* GIVEN - zero as denominator */
    /* THEN - throws */
    Assertions.assertThrows(Exception.class, () -> calculator.divide(13, 0), "Should've thrown");

  }
}
