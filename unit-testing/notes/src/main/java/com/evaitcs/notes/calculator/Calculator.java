package com.evaitcs.notes.calculator;

public class Calculator {

  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {

    return 0;
  }
  public int multiply(int a, int b) {

    return 0;
  }

  /**
   *
   * @param numerator
   * @param denominator
   * @return
   */
  public int divide(int numerator, int denominator) throws Exception {
    if (denominator == 0) {
      throw new Exception("Cannot divide by zero");
    }

    return numerator/ denominator;
  }
}
