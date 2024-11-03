package com.csc;

import java.util.ArrayList;

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

  // Adds together two triangular numbers
  public int add(int value1, int value2)
  {
    return value(value1) + value(value2);
  }

  // Subtracts two triangular numbers
  public int subtract(int value1, int value2)
  {
    return value(value1) - value(value2);
  }

  // Multiplies together two triangular numbers
  public int multiply(int value1, int value2)
  {
    return value(value1) * value(value2);
  }

  // Divides two triangular numbers
  public double divide(int value1, int value2)
  {
    return (double) value(value1) / (double) value(value2);
  }

  // Outputs a list of triangle values of the input value going down to 1
  public ArrayList<Integer> sequence(int input)
  {
    ArrayList<Integer> list = new ArrayList<>();
    if(input > 0)
    {
      list.add(value(input));
      list.addAll(sequence(input - 1));
    }
    return list;
  }
}
