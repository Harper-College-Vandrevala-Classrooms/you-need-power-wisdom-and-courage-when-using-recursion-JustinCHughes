package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  @Test
  void oneValueTest() {
    assertEquals(1,calculator.value(1));
  }

  @Test
  void twoValueTest() {
    assertEquals(3,calculator.value(2));
  }

  @Test
  void fourValueTest() {
    assertEquals(10,calculator.value(4));
  }

  @Test
  void oneOneAddTest() {
    assertEquals(2, calculator.add(1,1));
  }

  @Test
  void twoThreeAddTest() {
    assertEquals(9, calculator.add(2,3));
  }

  @Test
  void fourTwoAddTest() {
    assertEquals(13, calculator.add(4,2));
  }

  @Test
  void oneOneSubtractTest() {
    assertEquals(0, calculator.subtract(1,1));
  }

  @Test
  void twoThreeSubtractTest() {
    assertEquals(-3, calculator.subtract(2,3));
  }

  @Test
  void fourTwoSubtractTest() {
    assertEquals(7, calculator.subtract(4,2));
  }

  @Test
  void oneOneMultiplyTest() {
    assertEquals(1, calculator.multiply(1,1));
  }

  @Test
  void twoThreeMultiplyTest() {
    assertEquals(18, calculator.multiply(2,3));
  }

  @Test
  void fourTwoMultiplyTest() {
    assertEquals(30, calculator.multiply(4,2));
  }

  @Test
  void oneOneDivideTest() {
    assertEquals(1, calculator.divide(1,1));
  }

  @Test
  void twoThreeDivideTest() {
    assertEquals(0.5, calculator.divide(2,3));
  }

  @Test
  void fourTwoDivideTest() {
    assertEquals(3.3333333, calculator.divide(4,2),0.0001);
  }
}
