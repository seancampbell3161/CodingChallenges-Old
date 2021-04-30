/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Given a string str, reverse it omitting all non-alphabetic characters.
*/
public class ReverseLetters {
    
    public static String reverseLetter(final String str) {
      
      String newStr = str.replaceAll("[^a-zA-Z]", "");
        
      StringBuilder strBuilder = new StringBuilder();
       
      for (char c : newStr.toCharArray()) {
        strBuilder.append(c);
      }
      
      return strBuilder.reverse().toString();
            
    }
    
    public static void main(String[] args) {
        System.out.println(reverseLetter("Edward89"));
    }
    
}
