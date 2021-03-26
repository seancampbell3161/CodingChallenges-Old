
import java.util.Arrays;

/*
 * Copyright 2021 Sean Campbell
 */


public class ReverseDigits {
    
    public static int[] digitize (long n) {
        
        int length = Long.toString(n).length();
        
        int[] array = new int[length];
        
        for (int i=0; i<length; i++) {
            array[i] = (int)n % 10;
            n /= 10;
        }
        
        return array;
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(digitize(528705263)));
        
    }

}
