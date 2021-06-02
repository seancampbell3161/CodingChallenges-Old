
import java.util.Scanner;

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
Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
*/
public class StringsExercise {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.nextLine();
        String string2 = scan.nextLine();
        
        System.out.println(string1.length() + string2.length());
        
        String result = string1.compareTo(string2) > 0 ? "Yes" : "No";
        System.out.println(result);
        
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();    
        array1[0] = Character.toUpperCase(array1[0]);
        array2[0] = Character.toUpperCase(array2[0]);
        
        System.out.print(String.valueOf(array1) + " " + String.valueOf(array2));
    }
    
}
