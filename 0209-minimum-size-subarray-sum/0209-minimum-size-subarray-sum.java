class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int left=0;
        int sum=0;
        int minlength=Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            // Window is valid, shrink it as much as possible
            while(sum>=target){
                int length=right-left +1; //we are dealing with length not index
                minlength=Math.min(length,minlength);
                sum-=nums[left];
                left++;
            }
        }
        // No valid subarray found
        int result=(minlength==Integer.MAX_VALUE)?0:minlength;
        return result;
    }
}