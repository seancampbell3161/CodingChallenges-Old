/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Write a function that takes such collection and counts the points of our 
team in the championship. Rules for counting points for each match:

if x>y - 3 points
if x<y - 0 point
if x=y - 1 point
*/

public class footballPoints {
    
    public static int points(String[] games) {
      
      int ourScore = 0;
      int theirScore = 0;
      int totalPoints = 0;
      
      for(String s : games) {
        
        ourScore = Character.getNumericValue(s.charAt(0));
        theirScore = Character.getNumericValue(s.charAt(2));
        
        if(ourScore > theirScore) {
          totalPoints += 3;
        } else if (ourScore == theirScore) {
          totalPoints += 1;
        }
      }
      
      return totalPoints;
          
    }
    
}
