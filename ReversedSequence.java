/*
 * Copyright 2021 Sean Campbell
 */


public class ReversedSequence {
    
    public static int[] reverse(int n) {
        
        int[] array = new int[n];
        
    
        for(int i=n-1; i>=0; i--) {

          array[i] = n;     
          n--;
        }

        return array;
        
    }
    
    public static void main(String[] args) {
        
        int [] newArray = reverse(5);
        
        for (int n : newArray) {
            System.out.print(n+" ");
        }
                
        
    }

}
