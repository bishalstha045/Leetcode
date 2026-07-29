class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1])low=mid+1;
            else high=mid;
        }
        return low;
    }
}
// Binary Search is used to find a peak element.
// If nums[mid] < nums[mid + 1], the peak is on the right, otherwise it is on the left (or at mid).
// The loop runs while (l < h) because when l == h, only one element is left, which is the peak.
// Using l <= h is unnecessary and may cause nums[mid + 1] to go out of bounds.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)$0