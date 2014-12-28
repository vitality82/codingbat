TASK:

Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops). 

factorial(1) � 1
factorial(2) � 2
factorial(3) � 6

SOLUTION:

public int factorial(int n) {
  
  if(n<=0) return 0;
  if(n==1) return 1;
  
  return n*factorial(n-1);
}

/*
   example:
   
   factorial(3) = 3 * factorial(2)
   = 3 * 2 * factorial(1)
   = 3 * 2 * 1 = 3  
*/
