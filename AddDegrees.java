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
Find the total sum of internal angles (in degrees) in an n-sided simple polygon. 
N will be greater than 2.
*/
public class AddDegrees {
    public static int sumOfAngles(int n) {
    int count = 3;
    int degrees = 0;
    while(count <= n) {
      degrees += 180;
      count++;
    }
    
    return degrees;
  }
    
    public static void main(String[] args) {
        System.out.println(sumOfAngles(5));
    }
}
