/*
 * Copyright 2021 Sean Campbell
 */


public class ReversedStrings {
    
    public static String solution (String str) {
        
        
        /*char[] arr = str.toCharArray();
        
        char[] arrRev = new char[str.length() - 1];
    
        //String output = "";
        
        int count = 0;

        for(int i=arr.length-1; i<=0; i--) {
          arrRev[count] = arr[i];
          count++;
        }
        
        String str2 = String.valueOf(arrRev);
        System.out.println(arrRev);
        return str2;*/
        
        /*StringBuilder strbuilder = new StringBuilder();
        
        strbuilder.append(str);
        strbuilder.reverse();
        String str2 = strbuilder.toString();
        
        return str2;*/
        
        return new StringBuilder(str).reverse().toString();
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(solution("world"));
        
    }

}
