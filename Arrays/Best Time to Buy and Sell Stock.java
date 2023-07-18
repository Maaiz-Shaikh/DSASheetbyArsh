// Question Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

// buy when price is lower then previous buys, and sell otherwise where-ever getting max profit store it in profit variable
// TC: O(n), SC: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int buy = Integer.MAX_VALUE;

        for(int i=0; i<n; i++) {
            if(buy > prices[i]) {
                buy = prices[i];
            }else {
                profit = Math.max(profit, prices[i] - buy);
            }
        }

        return profit;
    }
}
