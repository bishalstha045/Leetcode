class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] customer : accounts) {
            int wealth = 0;
            for (int money : customer) {
                wealth += money;
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}

// accounts[i]     -> current customer (row)
// accounts[i][j]  -> money in a bank account
// Step 1: Find sum of each row
// Step 2: Compare with maximum wealth
// Step 3: Return maximum wealth