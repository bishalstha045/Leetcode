class Solution {
    public int mySqrt(int x) {
        int root = 0;

        for (int i = 1; i <= x / i; i++) {
            root = i;
        }

        return root;
    }
}

// Use i <= x / i instead of i*i <= x to avoid integer overflow
// Iterate until condition fails and keep updating root
