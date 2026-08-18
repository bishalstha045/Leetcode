class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];
        // Count how many k-sized subarrays contain each number
        for (int i = 0; i <= n - k; i++) {
            boolean[] seen = new boolean[51];
            for (int j = i; j < i + k; j++) {
                if (!seen[nums[j]]) {
                    freq[nums[j]]++;
                    seen[nums[j]] = true;
                }
            }
        }
        int ans = -1;
        // Start from 0 because nums[i] can be 0
        for (int i = 0; i <= 50; i++) {
            if (freq[i] == 1) {
                ans = i;
            }
        }
        return ans;
    }
}
/*
I used a frequency array to count how many subarrays of size k
contain each number.
For every subarray, I used a boolean seen array so that if the same
number appears multiple times in that subarray, I count it only once.
After checking all subarrays, I find the largest number whose
frequency is exactly 1, because that means it appears in exactly
one subarray of size k.
I start the loop from 0 because nums[i] can also be 0.
Time Complexity: O(n * k)
Space Complexity: O(1)
*/