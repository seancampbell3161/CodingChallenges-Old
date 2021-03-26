/*
 * Copyright 2021 Sean Campbell
 */


public class EvenOrOdd {
    
    //Create a function (or write a script in Shell) that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
    
    public static String even_or_odd(int number) {
        
        if(number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(even_or_odd(42));
        System.out.println(even_or_odd(523493));
        
    }

}
