/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Given a Divisor and a Bound , Find the largest integer N , Such That ,

Conditions :
N is divisible by divisor

N is less than or equal to bound

N is greater than 0.
*/
public class MaximumMultiple {
    
    public static int maxMultiple(int divisor, int bound) {
    
    // n % divisor == 0
    // n <= bound
    // n > 0
    
    int result = 0;
    
    for(int i=1; i <= bound; i++) {
      if (i % divisor == 0) {
        result = i;
      }
    }
    
    return result;
  }
    
}
