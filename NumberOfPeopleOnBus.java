
import java.util.ArrayList;

/*
 * Copyright 2021 Sean Campbell
 */

/* You are provided with a list (or array) of integer arrays (or tuples). 
Each integer array has two items which represent number of people get into bus 
(The first item) and number of people get off the bus (The second item) in a bus stop.

Your task is to return number of people who are still in the bus after the last 
bus station (after the last array). */


public class NumberOfPeopleOnBus {
    
    public static int countPassengers(ArrayList<int[]> stops) {
        int numberOfPeople = 0;
        
        for (int[] array : stops) {
            numberOfPeople += array[0];
            numberOfPeople -= array[1];
        }
        
        return numberOfPeople;
  }
    
    
    public static void main(String[] args) {
        
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        
        System.out.println(countPassengers(list));
        
    }

}
