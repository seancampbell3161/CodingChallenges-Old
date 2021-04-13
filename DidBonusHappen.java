/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... 
but who is going to make the most money?

Build a function that takes in two arguments (salary, bonus). Salary will be an integer, 
and bonus a boolean.

If bonus is true, the salary should be multiplied by 10. If bonus is false, 
the fatcat did not make enough money and must receive only his stated salary.

Return the total figure the individual will receive as a string prefixed with "£"
*/
public class DidBonusHappen {
    
    public static String bonusTime(final int salary, final boolean bonus) {
    
    int bonusSalary = salary;
    
    if(bonus == true) {
      bonusSalary *= 10;
    }
    
    return "\u00A3" + Integer.toString(bonusSalary);
  }
    
    public static void main(String[] args) {
        
        
        System.out.println(bonusTime(1000, true));
        System.out.println(bonusTime(1000, false));
    }
    
}
