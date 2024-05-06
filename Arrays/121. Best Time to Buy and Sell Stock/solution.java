class Solution {
    /*
        Approach 2: Buy Low Sell High
        Intuition: Iterate through the array of prices and keep track of the current potential 
        profit that can be obtained by selling at the current price with 'profit = prices[i] - minPrice)', 
        the maximum profit with 'maxProfit = Math.max(maxProfit, profit)', and the minimum 
        stock price seen so far with 'minPrice'. 

        Time Complexity: O(n) -  only one traversal of the array is required, so the time complexity is linear.
        Space Complexity: O(1) - constant extra space used to store 'minPrice' and 'maxProfit' variables.
    */
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(prices[i], minPrice);
        }

        return maxProfit;
    }


    /*
        Approach 1: Brute Force
        Intuition: Using a nested for loop to traverse the array and check the maximum profit.

        Time Complexity: O(n^2) - Time Limit Exceeded
        Space Complexity: O(1)
    */
    // public int maxProfit(int[] prices) {
    //     int maxProfit = 0;
        
    //     for (int i = 0; i < prices.length; i++) {
    //         for (int j = i + 1; j < prices.length; j++) {
    //             int profit = -prices[i] + prices[j];
    //             maxProfit = Math.max(profit, maxProfit);                
    //         }
    //     }
        
    //     if (maxProfit < 0) {
    //         return 0;
    //     } else { 
    //         return maxProfit;
    //     }
    // }
}