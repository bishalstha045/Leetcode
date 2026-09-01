class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double maxsum=-Double.MAX_VALUE;
        double sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while((right-left+1)>k){
                sum-=nums[left];
                left++;
            }
            if((right-left+1)==k){
                maxsum=Math.max(maxsum,sum/k);
            }
        }
        return maxsum;
    }
}
// Start with a window of size k and keep its sum.
// Expand the window using right and remove the left element when size becomes greater than k.
// Whenever the window size is exactly k, calculate its average and update the maximum average.
// This sliding window approach avoids recalculating the sum for every subarray, making it O(n).
