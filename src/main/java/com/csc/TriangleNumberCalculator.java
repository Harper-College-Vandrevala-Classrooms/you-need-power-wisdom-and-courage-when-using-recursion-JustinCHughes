package com.csc;

public class TriangleNumberCalculator {
  // Your code goes here!
  public int value(int input)
  {
    if(input > 0)
    {
      return input + value(input - 1);
    }
    return input;
  }

  public int add(int value1, int value2)
  {
    return value(value1) + value(value2);
  }

  public int subtract(int value1, int value2)
  {
    return value(value1) - value(value2);
  }
}
