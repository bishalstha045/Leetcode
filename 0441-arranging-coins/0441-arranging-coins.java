class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        while(row<=n){
        n=n-row;
        row++;
        }
        return row-1;
    }
}

// i will do it again using binary search, binary search results in giving O(1).