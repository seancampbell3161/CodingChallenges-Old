/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;


public class Sum {
    
    public int GetSum(int a, int b) {
        
    return (a + b) * (Math.abs(a - b) + 1) / 2;
    
    }
    
    public static void main(String[] args) {
        
        
        Sum s = new Sum();
        
        System.out.println(s.GetSum(7, 3));
        
        int i = 7 + 6 + 5 +4+3;
        
        System.out.println(i);
        
    }
    
}
