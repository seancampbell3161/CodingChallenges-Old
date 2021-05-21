
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean
 */
public class AlternateCapitalization {
    
    public static String[] capitalize(String s){    
      char[] chars = s.toCharArray();
      for (int i = 0; i < s.length(); i+=2) {
          chars[i] = Character.toUpperCase(chars[i]);
      }
      String result1 = new String(chars);
      
      char[] chars2 = s.toCharArray();
      for (int i = 1; i < s.length(); i+=2) {
          chars2[i] = Character.toUpperCase(chars[i]);
      }
      String result2 = new String(chars2);
      
      String[] result = new String[] {result1, result2};
      
      return result;
    }
      
      public static void main(String[] args) {
        
          
          String[] array = capitalize("abcdef");
          
          System.out.println(Arrays.toString(array));
    }
      
      
    
    
}
