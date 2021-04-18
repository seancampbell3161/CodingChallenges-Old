/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */
/*
Given two numbers and an arithmetic operator (the name of it, as a string),
return the result of the two numbers having that operator used on them.

a and b will both be positive integers, and a will always be the first number
in the operation, and b always the second.

The four operators are "add", "subtract", "divide", "multiply".

Try to do it without using if statements!
*/
public class ArithmeticFunction {
    
    public static int arithmetic(int a, int b, String operator) {
    
    return operator == "add" ? (a + b) : operator == "subtract" ? (a - b) : 
            operator == "multiply" ? (a * b) : operator == "divide" ? (a / b)
            : 0;
    
  }
    
    public static void main(String[] args) {
        
        
        System.out.print(arithmetic(4, 5, "multiply"));
        
    }
    
}
