/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.
*/

public class RotateArray {
    
    public void rotate(int[] nums, int k) {    
        
        for(int i=0; i<k; i++) {
            
            int j, last;
            last = nums[nums.length - 1];
            
            for(j = nums.length - 1; j>0; j--) {
                nums[j] = nums[j-1];
            }         
            nums[0] = last;           
        }      
        System.out.print("[");       
        for (int n : nums) {
            System.out.print(n);
            if(n != nums.length-1) {
                System.out.print(", ");
            }
        }
        
        System.out.print("]");
        
    }
    
}
