class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = prices[0];
        int maxprofit = 0;
        
        for(int i = 0; i<prices.length; i++){
            minSoFar = Math.min(minSoFar, prices[i]);
            int profit = prices[i] - minSoFar;
            maxprofit = Math.max(maxprofit , profit);
        }
        
        return maxprofit;
    }
}