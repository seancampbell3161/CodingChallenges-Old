/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
your function receives an array of integers as input. Your task is to
determine whether the numbers are in ascending order. An array is said to be
in ascending order if there are no two adjacent integers where the left integer 
exceeds the right integer in value.
*/
public class AscendingOrder {
    
    public static boolean isAscOrder(int[] arr) {
    
    if (arr.length == 1) return true;
    
    for(int i=1; i<arr.length; i++) {
      if(arr[i-1] > arr[i]) {
        return false;
      }
    }
    return true;
  }
    
    public static void main(String[] args) {
        
        int[] array1 = new int[] {1,2,3,4,5};
        int[] array2 = new int[] {1,2,4,3};
        
        System.out.println(isAscOrder(array1));
        System.out.println(isAscOrder(array2));
    }
    
}
