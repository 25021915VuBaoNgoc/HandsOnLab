package com.auction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hàm tính toán.
 */
public class Calculator {

  private static final Logger LOGGER = LoggerFactory.getLogger(Calculator.class);

  /**
   * Hàm tính tổng.
   *
   * @param a so thu nhat
   * @param b so thu 2
   * @return tổng a + b
   */
  public int add(int a, int b) {
    int result = a + b;
    LOGGER.info("In add() method: a={}, b={}, result={}", a, b, result);
    return result;
  }

  /**
   * Hàm tính thương.
   *
   * @param a so thu nhat
   * @param b so thu 2
   * @return thương
   */
  public int divide(int a, int b) {
    if (b == 0) {
      LOGGER.error("a={}, b={}", a, b);
      throw new IllegalArgumentException("Division by zero");
    }
    int result = a / b;
    LOGGER.info("In divide() method: a={}, b={}, result={}", a, b, result);
    return result;
  }
}