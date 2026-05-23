class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }

        return count <= 1;
    }
}
// count = number of places where current element > next element
// in a sorted rotated array this can happen at most once

// nums[(i + 1) % n] handles circular comparison
// last element compares with first element

// if count > 1 → not sorted & rotated
// else → valid