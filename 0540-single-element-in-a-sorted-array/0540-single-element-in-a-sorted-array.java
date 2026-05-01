class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        // base cases
        if (n == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
        int low = 1, high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }
            if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) ||
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}


/*
Steps:
1. Use binary search to find mid.
2. Check if mid is part of a valid pair:
   - If mid is even → compare with mid+1
   - If mid is odd → compare with mid-1
3. If pair is valid → single element is on right side
4. Else → single element is on left side

Time Complexity: O(log n)
Space Complexity: O(1)
*/