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
If we list all the natural numbers below 10 that are multiples of 3 or 5, we 
get 3, 5, 6 and 9. The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 
below the number passed in.
*/
public class MultiplesOfThreeAndFiveSum {
    
    public static int solution(int number) {
    int sum=0;
    
    for (int i=0; i < number; i++){
      if (i%3==0 || i%5==0){sum+=i;}
    }
    return sum;
  }
    
    
    public static void main(String[] args) {
        System.out.println(solution(25));
    }
}
