class Solution {
    public int maxProfit(int[] prices) {
        int currstock=prices[0];
        int maxprofit=0;
        for(int price:prices){
            currstock=Math.min(currstock,price);
            int profit=price-currstock;
            maxprofit=Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}
/*
 * I solved this problem by traversing the prices array once while maintaining the lowest stock price encountered so far. 
 * For each day's price, I calculate the profit if the stock is sold on that day and compare it with the maximum profit 
 * found so far. This greedy approach efficiently finds the best buy and sell combination in O(n) time using O(1) extra space.
 */