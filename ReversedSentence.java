/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
Complete the solution so that it reverses all of the words within the string passed in.
*/
public class ReversedSentence {
    
   public static String reverseWords(String str){
   
   String[] strArray = str.split(" ");
   String result = "";
   
   for(int i = strArray.length-1; i >= 0; i--) {
     result += strArray[i];
     if(i !=0) {
       result += " ";
     }
   }
   return result;
 }
   
    public static void main(String[] args) {
        
        
        System.out.println(reverseWords("I like pie"));
    }
    
}
