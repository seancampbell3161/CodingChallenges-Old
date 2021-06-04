
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
Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the 
string into tokens. We define a token to be one or more consecutive English 
alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
*/
public class StringTokens {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String[] array = string.split("[ !,?._'@]+");
        int count = array.length;
        System.out.println(count);
        for(String s : array) {
            System.out.println(s);
        }
    }
    
}
