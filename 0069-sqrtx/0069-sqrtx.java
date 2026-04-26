class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;  // 🔥 fix division by zero
        
        int low = 1;
        int high = x;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (mid == x / mid) {
                return mid;
            } 
            else if (mid < x / mid) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        
        return high;
    }
}

/*
Binary Search to find floor(sqrt(x))

Key points:
1. Avoid overflow → use mid <= x / mid instead of mid * mid
2. Avoid division by zero → handle x == 0 and start low from 1

At the end:
- high = largest value such that high * high <= x
So return high.

Time: O(log x)
Space: O(1)
*/