class Solution {
    public int coinChange(int[] coins, int amount) {
        
        // dp[i] = minimum coins needed to make amount i
        int[] dp = new int[amount + 1];

        // Initialize with a large value
        for (int i = 0; i <= amount; i++) {
            dp[i] = amount + 1;
        }

        dp[0] = 0;

        // Bottom-up DP
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        // If not possible to form amount
        return dp[amount] > amount ? -1 : dp[amount];
    }
}