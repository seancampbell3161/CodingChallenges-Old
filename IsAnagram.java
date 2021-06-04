
import java.util.ArrayList;
import java.util.Collections;
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
wo strings,  and , are called anagrams if they contain all the same characters 
in the same frequencies. For this challenge, the test is not case-sensitive. 
Return:
boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
*/
public class IsAnagram {
    
    public static String isAnagram(String s1, String s2) {
        ArrayList<String> array1 = new ArrayList<>();
        ArrayList<String> array2 = new ArrayList<>();
        
        for(String s : s1.toUpperCase().split("")) {
            array1.add(s);
        }
        for(String s : s2.toUpperCase().split("")) {
            array2.add(s);
        }
        
        Collections.sort(array1);
        Collections.sort(array2);
        
        return array1.equals(array2) ? "Anagrams" : "Not Anagrams";    
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String String1 = scan.nextLine();
        String String2 = scan.nextLine();
        
        System.out.println(isAnagram(String1, String2));
    }
    
}
