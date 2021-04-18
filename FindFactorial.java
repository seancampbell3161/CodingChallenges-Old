/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */
public class FindFactorial {
    
    public static int factorial(int n) throws IllegalArgumentException {
    
    if (n < 0 || n > 12) {
      throw new IllegalArgumentException();
    }
    
    if(n <= 1) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
    
    public static void main(String[] args) {
        
        System.out.println(factorial(5));
        
    }
    
}
