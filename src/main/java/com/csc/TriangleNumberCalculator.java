package com.csc;

public class TriangleNumberCalculator {
  // Your code goes here!
  public int value(int value)
  {
    int x = 1;
    int answer = 0;

    if(value == 0 || value == 1)
    {
      return value;
    }

    while(x <= value)
    {
      answer = x + answer;
      x++;
    }

    return answer;
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
