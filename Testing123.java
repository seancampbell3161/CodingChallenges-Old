
import java.util.ArrayList;
import java.util.List;

/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Write a function which takes a list of strings and returns each line prepended 
by the correct number.
*/
public class Testing123 {
    
    public static List<String> number(List<String> lines) {
        
      List<String> resultArray = new ArrayList<>();
      int count = 1;
      
      
      for(String s : lines) {
        String str = String.valueOf(count);
        resultArray.add(str + ": " + s);
        count++;
      }
      
      return resultArray;
    }
    
}
