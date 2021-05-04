
import java.util.Arrays;

/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
public class DuplicateInts {
    
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i-1]) {
                    return true;
                }
            }
        } 
        
        return false;
        
    }
    
}
