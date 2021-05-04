
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Copyright 2021 Sean Campbell
 */

/*ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.

If the function is passed a valid PIN string, return true, else return false.*/

public class Pin {
    
    public static boolean validatePin(String pin) {
        
        String regex = "[0-9]+$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pin);
        boolean matchFound = matcher.find();
        
        if((pin.length() == 4) || (pin.length() == 6)) {
            return matchFound;
        } else {
            return false;
        }      
        
    }
    
    public static void main(String[] args) {
        
        System.out.println(validatePin("12345d"));
        
    }

}
