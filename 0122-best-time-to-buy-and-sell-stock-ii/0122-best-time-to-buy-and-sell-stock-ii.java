class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int profit=0;
       for(int i=1;i<n;i++){
        if(prices[i]>prices[i-1]){
            profit+=prices[i]-prices[i-1];
        }
       } 
       return profit;
    }
}
/*
I iterate through the prices array and add every positive price difference between consecutive days. Since multiple transactions are allowed, capturing every upward price movement guarantees the maximum profit. This greedy solution runs in O(n) time with O(1) extra space.
*/