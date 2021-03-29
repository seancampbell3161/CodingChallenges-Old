
import java.text.DecimalFormat;

/*
 * Copyright 2021 Sean Campbell
 */

/* Your task is to write a function which returns the sum of following series up 
to nth term(parameter).

Rules:
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return 0.00

You will only be given Natural Numbers as arguments. */


public class SumOfSeries {
    
    public static String seriesSum(int n) {
		
        double initValue = 3;
        double sum = 0;

        for (int i = 0; i<n - 1; i++) {
          sum += (1 / (1+initValue));
          initValue += 3;
        }

        sum += 1;        
       
        DecimalFormat df = new DecimalFormat("#.##");
        String formatString = df.format(sum);

        return formatString;
    }
    
    public static void main(String[] args) {
               
        System.out.println(seriesSum(15));
    }

}
