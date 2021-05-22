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
We want to generate a function that computes the series starting from 0 and ending until the given number.
*/
public class SumOfNumbersToN {
    public static String showSequence(int value){
        int count = 0;
        int sum = 0;
        while(count <= value) {
            sum += count;
            count++;
        }
        
        StringBuilder strBuilder = new StringBuilder();
        
        for(int num = 0; num <= value; num++) {
            if(num != value) {
                strBuilder.append(String.valueOf(num) + "+");
            } else {
                strBuilder.append(String.valueOf(num) + " = ");
            }
            
        }
        
        String result = String.valueOf(sum);
        
        return strBuilder.toString() + result;
  }
    
    public static void main(String[] args) {
        System.out.println(showSequence(6));
        System.out.println(showSequence(8));
    }
}
