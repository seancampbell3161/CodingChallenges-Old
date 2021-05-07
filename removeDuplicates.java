/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */
public class removeDuplicates {
    
    public static int returnLength(int[] arr) {
        
        int nextNonDuplicate = 1; //number of unique values
        int i = 1;
        
        while(i < arr.length) {
            if(arr[nextNonDuplicate - 1] != arr[i]) {
                arr[nextNonDuplicate] = arr[i];
                nextNonDuplicate += 1 ;
            }
            i += 1;
        }
        
        return nextNonDuplicate;
    }
    
    
    public static void main(String[] args) {
        
        int[] intArray = new int[] {1,2,4,3,3};
        
        System.out.println(returnLength(intArray));
    }
    
}
