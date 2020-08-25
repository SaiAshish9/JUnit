package com.test.junit;

public class MyMath {
  int sum(int[] numbers) {
	  int sum=0;
	  for (int i = 0; i < numbers.length; i++) {
		sum+=i;
	}
	  return sum;  
  }
}
