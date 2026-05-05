class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        
        while (n % 3 == 0) {
            n /= 3;
        }
        
        return n == 1;
    }
}

// Approach: Keep dividing n by 3 until it's no longer divisible.
// If n becomes 1, then it's a power of 3.
// Time Complexity: O(log n)
// Space Complexity: O(1)