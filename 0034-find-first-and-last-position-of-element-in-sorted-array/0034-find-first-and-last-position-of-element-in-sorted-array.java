class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length -1;
        int []ans ={-1,-1};
        // for first occurence
        while(low<=high){
           int  mid= low + (high-low)/2 ;
            if(nums[mid]== target){
                ans[0]= mid;
                high = mid -1; // moving left
            }
            else if (nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        low = 0;
        high = nums.length-1;
        //for second last occurence
        while(low<=high){
          int  mid= low + (high-low)/2 ;  
            if(nums[mid]== target){
                ans[1]= mid;
                low = mid+1; // moving right
            }
            else if (nums[mid]<target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
}

// Approach: Use Binary Search twice
// 1. First binary search finds the first occurrence of target
//    → move left when found (high = mid - 1)
// 2. Second binary search finds the last occurrence of target
//    → move right when found (low = mid + 1)
// Time Complexity: O(log n)
// Space Complexity: O(1)