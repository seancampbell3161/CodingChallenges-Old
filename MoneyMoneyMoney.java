
import java.util.Arrays;

/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
An anagram is the result of rearranging the letters of a word to produce a new word (see wikipedia).

Note: anagrams are case insensitive

Complete the function to return true if the two arguments given are anagrams of each other; return false otherwise.
*/

public class MoneyMoneyMoney {
    
    public static boolean isAnagram(String test, String original) {
        
    original = original.toLowerCase();
    test = test.toLowerCase();
    
    char[] ogArray = original.toCharArray();
    char[] newArray = test.toCharArray();
    
    Arrays.sort(ogArray);
    Arrays.sort(newArray);
    
    if (ogArray.length != newArray.length) {
        return false;
    }
    
    for(int i=0; i<ogArray.length; i++) {
        if(newArray[i] != ogArray[i]) {
            return false;
        }
    }
    
    return true;
  }
    
    
    public static void main(String[] args) {
        
        
        System.out.println(isAnagram("apple", "pale"));
    }
    
}
