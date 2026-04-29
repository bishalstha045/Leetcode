class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // first index > -1 → first non-negative
        int negCount = binarySearch(nums, -1);

        // first index > 0 → first positive
        int posStart = binarySearch(nums, 0);
        int posCount = n - posStart;

        return Math.max(negCount, posCount);
    }

    // returns first index where nums[i] > target
    private int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}

// Binary search approach (O(log n))
// Find:
// 1) Count of negatives = first index where element > -1
// 2) Count of positives = n - first index where element > 0
// Return max of both