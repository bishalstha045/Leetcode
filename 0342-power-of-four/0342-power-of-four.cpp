class Solution {
public:
    bool isPowerOfFour(int n) {
        if (n<=0) return false;
        if(n==1) return true;
        while(n % 4==0){
            n/=4;
            if(n==1) return true;
        }
        return false;
    }
};

// Approach:
// Keep dividing n by 4 until it is no longer divisible by 4.
// If the final value becomes 1, then n is a power of 4.
// Time Complexity: O(log₄ n)
// Space Complexity: O(1)