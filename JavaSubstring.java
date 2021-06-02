
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
Given a string, , and two indices,  and , print a substring consisting of all 
characters in the inclusive range from  to .
*/
public class JavaSubstring {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        System.out.print(string.substring(num1, num2));
    }
    
}
