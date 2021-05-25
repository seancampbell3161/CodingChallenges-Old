/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sean
 */

/*
Your task is to write a function maskify, which changes all but the last four characters into '#'.
*/
public class Maskify {
    
    public static String maskify(String str) {
        if(str.length() <= 4) {
          return str;
        } else {
          StringBuilder strBuilder = new StringBuilder();       
          char[] array = str.toCharArray();
          
          for(int i = 0; i < array.length; i++) {
            if(i < array.length - 4) {
              strBuilder.append("#");
            } else {
              strBuilder.append(array[i]);
            }
          }
          return strBuilder.toString();
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println(maskify("85729501"));
        System.out.println(maskify("1234"));
        System.out.println(maskify("hellobatman"));
    }
    
}
