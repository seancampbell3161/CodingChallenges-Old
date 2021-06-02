
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
A palindrome is a word, phrase, number, or other sequence of characters which 
reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.
*/
public class StringReverseCompare {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string, stringReverse;
        string = scan.nextLine();
        stringReverse = "";
        
        for(int i = string.length() - 1; i >= 0; i--) {
            stringReverse += string.charAt(i);
        }
        
        if(string.equals(stringReverse)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
}
