package blind75.arrays;

/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */

public class C_Easy_BestTimeBuySellStock {

    // Brute Force, TC - O(n^2), SP - O(1), Leet code time exceed with the solution
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i=0; i<prices.length-1; i++){
            int buyPrice = prices[i];
            for(int j=i+1; j<prices.length; j++){
                int sellPrice = prices[j];
                int currProfit =  sellPrice - buyPrice;
                if(currProfit > maxProfit){
                    maxProfit = currProfit;
                }
            }
        }
        return maxProfit;

    }

    public int maxProfit_Optimized(int[] prices) {

        // Time Complexity - O(n), Space Complexity - O(1)

        //While looping through the array keep track of min and keep calculating profit while update max profit

        int maxProfit = 0;
        int min = prices[0];

        for(int i=0; i<prices.length; i++){
            maxProfit = Math.max(maxProfit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }

        return maxProfit;

    }


}
