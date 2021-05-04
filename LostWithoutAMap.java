
import java.util.Arrays;

/*
 * Copyright 2021 Sean Campbell
 */


public class LostWithoutAMap {
    
    public static int[] map(int[] arr) {
        
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }
    
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        
        for(int n : array) {
            System.out.print(n + " ");
        }
        
        System.out.println("");
        
        int [] newArray = map(array);
        
        for(int n : newArray) {
            System.out.print(n + " ");
        }
    }

}
