/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
public class Fighter {
  public String name;
  public int health, damagePerAttack;
  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}
*/
public class TwoFighters {
    
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
    Fighter a=fighter1, b=fighter2;
    if (firstAttacker.equals(fighter2.name)) {
      a = fighter2; b = fighter1;
    }    
    while (true) {      
      if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
      if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
    }
  }
    
    
    
}
