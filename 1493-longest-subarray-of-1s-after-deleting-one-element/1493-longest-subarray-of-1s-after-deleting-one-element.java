class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int left=0;
        int count=0;
        int max=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0)count++;
            while(count>1){
                if(nums[left]==0)count--;
                left++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}
// variable size Sliding Window
// Keep a window with at most one 0.
// Expand the window by moving right and count the number of zeros obtained.
// If the window has more than one 0, shrink it from the left.
// Since one element must be deleted, the valid length is (window size - 1),
// which is equal to (right - left).
// Track the maximum valid length throughout the traversal.