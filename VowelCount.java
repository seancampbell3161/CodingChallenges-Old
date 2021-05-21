
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean
 */

/*
Return the number (count) of vowels in the given string.

We will consider a, e, i, o, u as vowels for this Kata (but not y).

The input string will only consist of lower case letters and/or spaces.
*/
public class VowelCount {
    
    public static int getCount(String str) {
        
        int count = 0;
        
        char[] vowels = new char[] {'a', 'e', 'i', 'o', 'u'};
        char[] word = str.toCharArray();
        
        Set<Character> set = new HashSet();
        
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        
        for(char c : word) {
            if(set.contains(c)) count++;
        }
        
        return count;
        
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println(getCount("Banana"));
    }
    
}
