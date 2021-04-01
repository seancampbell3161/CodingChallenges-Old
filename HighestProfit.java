import java.util.Arrays;

/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Write a function that returns both the minimum and maximum number of the given list/array.
*/
public class HighestProfit {
    
    public static int[] minMax(int[] arr) {
      
      Arrays.sort(arr);
      int min = arr[0];
      int max = arr[arr.length-1];
      int[] array = new int []{min, max};
      
      return array;
    }
    
    public static void main(String[] args) {
        
        int[] intArray = new int[] {4,7,2,19,50,3};
        
        
        int[] newArray = minMax(intArray);
        
        for(int n : newArray) {
            System.out.print(n + " ");
        }
    }
    
}
