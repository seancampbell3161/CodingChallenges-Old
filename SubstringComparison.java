
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
Given a string, , and an integer, , complete the function so that it finds the 
lexicographically smallest and largest substrings of length .
*/
public class SubstringComparison {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int length = scan.nextInt();
        
        List<String> array = new ArrayList<>();
        
        for(int i = 0; i < string.length() - length + 1; i++) {
            array.add(string.substring(i, i+length));
        }
        
        Collections.sort(array);
        System.out.print(array.get(0) + "\n" + array.get(array.size()-1));
    }
    
}
