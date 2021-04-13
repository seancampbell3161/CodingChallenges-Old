
import java.util.HashMap;

/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
For this assignment, write a module that can calculate the amount of button 
presses required for any phrase. Punctuation can be ignored for this exercise. 
Likewise, you can assume the phone doesn't distinguish between upper/lowercase 
characters (but you should allow your module to accept input in either for convenience).
*/
public class OldKeypad {
    
    
    public static int presses(String phrase) {
    
    char[] charArray = phrase.toUpperCase().toCharArray();
    int presses = 0;
    int add = 0;
    
    HashMap<Character, Integer> one = new HashMap();
    one.put('1', 1);
    one.put('A', 1);
    one.put('D', 1);
    one.put('G', 1);
    one.put('J', 1);
    one.put('M', 1);
    one.put('P', 1);
    one.put('T', 1);
    one.put('W', 1);
    one.put(' ', 1);
    one.put('*', 1);
    one.put('#', 1);
    
    HashMap<Character, Integer> two = new HashMap();
    two.put('B', 2);
    two.put('E', 2);
    two.put('H', 2);
    two.put('K', 2);
    two.put('N', 2);
    two.put('Q', 2);
    two.put('U', 2);
    two.put('X', 2);
    two.put('0', 2);
    
    HashMap<Character, Integer> three = new HashMap();
    three.put('C', 3);
    three.put('F', 3);
    three.put('I', 3);
    three.put('L', 3);
    three.put('O', 3);
    three.put('R', 3);
    three.put('V', 3);
    three.put('Y', 3);
    
    HashMap<Character, Integer> four = new HashMap();
    four.put('2', 4);
    four.put('3', 4);
    four.put('4', 4);
    four.put('5', 4);
    four.put('6', 4);
    four.put('S', 4);
    four.put('8', 4);
    four.put('Z', 4);
    
    HashMap<Character, Integer> five = new HashMap();
    five.put('7', 5);
    five.put('9', 5);
    
    for(char c : charArray) {
        if(one.containsKey(c)) {
            presses += one.get(c);
        } else if (two.containsKey(c)) {
            presses += two.get(c);
        } else if (three.containsKey(c)) {
            presses += three.get(c);
        } else if (four.containsKey(c)) {
            presses += four.get(c);
        } else if (five.containsKey(c)) {
            presses += five.get(c);
        }
    }
    
    return presses;
    
  }
    
    
    public static void main(String[] args) {
        
        
        System.out.println(presses("i love u"));
    }
    
}
