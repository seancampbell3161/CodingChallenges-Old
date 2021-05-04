
import java.util.ArrayList;

/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
you get the start number and the end number of a region and should return the 
count of all numbers except numbers with a 5 in it. The start and the end number 
are both inclusive!
*/
public class DontGiveMeFive {
    
    public static int dontGiveMeFive(int start, int end) {
    
    ArrayList<Integer> array = new ArrayList<>();
    String num = "";
    
    for(int i = start; i <= end; i++) {
      
      num = Integer.toString(i);
      
      if(num.contains("5")) {
        continue;
      } else {
        array.add(i);
      }
    }
    return array.size();
  }
    
    public static int dontGiveMeFivev2(int start, int end) {
        
        int ans = 0;
        
        for(int i = start; i <= end; i++) {
            if(!("" + i).contains("5")) ans++;
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        
        System.out.println(dontGiveMeFive(4, 16));
        System.out.println(dontGiveMeFivev2(4, 16));
        
    }
    
}
