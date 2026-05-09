class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        long sum = 0;
        long f0 = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f0 += (long) i * nums[i];
        }
        long max = f0;
        long current = f0;
        for (int k = 1; k < n; k++) {
            current = current + sum - (long) n * nums[n - k];
            max = Math.max(max, current);
        }
        return (int) max;
    }
}

/*
Formula:
F(k) = F(k-1) + sum - n * lastElement

Steps:
1. Find total array sum.
2. Calculate F(0):
      F(0) = 0*nums[0] + 1*nums[1] + ...
3. Use formula to calculate next rotations efficiently.
4. Keep track of maximum value.

Time Complexity: O(n)
Space Complexity: O(1)

Optimal Solution:
- Only one traversal after initial calculation.
- No extra array used.
*/