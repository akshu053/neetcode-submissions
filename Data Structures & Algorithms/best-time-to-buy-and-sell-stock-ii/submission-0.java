class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;
        for(int i=0; i<prices.length-1; i++){

            if(prices[i]>prices[i+1]){
                profit = 0;
            }
            else if(prices[i] < prices[i+1]){
                profit = prices[i+1] - prices[i];
                
            }

            maxProfit += profit;
        }

        return maxProfit;
    }
}