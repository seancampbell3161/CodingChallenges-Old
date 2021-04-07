
import java.util.HashMap;
import java.util.Map;

/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */
public class FindOnlyNonDuplicate {
    
    static int stray(int[] numbers) {
    
    Map<Integer, Integer> m = new HashMap<>();
    
    for(int i=0; i<numbers.length; i++) {
      if(m.containsKey(numbers[i])) {
        m.put(numbers[i], m.get(numbers[i]) + 1);
      } else {
        m.put(numbers[i], 1);
      }
    }
    
    for(int i=0; i<numbers.length; i++) {
      if(m.get(numbers[i]) == 1) {
        return numbers[i];
      }      
    }
    return -1;
  }
    
}
