/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Complete the solution so that it returns true if the first argument(string) 
passed in ends with the 2nd argument (also a string).
*/
public class StringEndsWith {
    
    public static boolean solution(String str, String ending) {
        
        int length = ending.length();
        
        if(ending.length() > str.length()) {
            return false;
        }
        
        if(str.lastIndexOf(ending) == str.length() - length) {
            return true;
        }
              
        return false;
  }
    
    public static void main(String[] args) {
        
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("abc", "abcd"));
        
    }
    
}
