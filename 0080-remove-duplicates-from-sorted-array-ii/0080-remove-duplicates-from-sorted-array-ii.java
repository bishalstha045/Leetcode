class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=2)return n;
        int slow=2;
        for(int fast=2;fast<n;fast++){
            if(nums[fast]==nums[slow-2])continue;
            nums[slow]=nums[fast];
            slow++;
        }
        return slow;
    }
}
/*
Since the array is sorted, duplicates are adjacent, so we use two pointers to modify the array in-place. The first two elements are always kept, and for each remaining element, we compare it with `nums[slow - 2]`. If they are different, we copy the element; otherwise, we skip it because two occurrences have already been included. This solution runs in O(n) time and uses O(1) extra space.
*/
