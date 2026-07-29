class Solution {
    public int findPeakElement(int[] nums) {
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int m=l+(h-l)/2;
            if(nums[m]<nums[m+1])l=m+1;
            else h=m;
        }
        return l;
    }
}
// Binary Search is used to find a peak element.
// If nums[mid] < nums[mid + 1], the peak is on the right, otherwise it is on the left (or at mid).
// The loop runs while (l < h) because when l == h, only one element is left, which is the peak.
// Using l <= h is unnecessary and may cause nums[mid + 1] to go out of bounds.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)