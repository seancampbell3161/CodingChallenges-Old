/*
 * Copyright 2021 Sean Campbell
 */

/**
 *
 * @author sean
 */

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

Find the maximum profit you can achieve. You may complete as many transactions
as you like (i.e., buy one and sell one share of the stock multiple times).
*/
public class BuyingStock {
    
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        
        for(int i=0; i<prices.length-1; i++) {
            if(prices[i] < prices[i+1] && prices[i] != prices.length) {
                profit += (prices[i+1] - prices[i]);
                i++;
            }
        }
        
        return profit;
        
    }
    
    
    
}
