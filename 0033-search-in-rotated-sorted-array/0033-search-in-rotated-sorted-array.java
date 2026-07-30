class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)return mid;
            //search left sorted part
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && nums[mid]> target){
                    high=mid-1;
                }
                else low=mid+1;
            }
            else{
                if(nums[mid]<=target && nums[high]>=target){
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
    }
}
// In every iteration, one half of the rotated array is always sorted.
// Check whether the target lies inside the sorted half.
// If yes, continue searching there; otherwise search the other half.
// This reduces the search space by half each time, giving O(log n) time complexity.