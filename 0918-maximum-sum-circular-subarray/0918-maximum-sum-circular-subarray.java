class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=0;
        for(int el:nums){
            total+=el;
        }
        int normalsum=kadanes(nums);
        for(int i=0;i<nums.length;i++){
            nums[i]=-nums[i];
        }
        int invertedsum=kadanes(nums);
        int maxwrap=total+invertedsum;//here i did addition of inverted sum because i have inverted its sign before it was negative after i perform invertion it becomes negative so if i want to get maximum sum using circular loop then i should add this element which was deleted in total sum when it was negative
        return (maxwrap==0)?normalsum:Math.max(normalsum,maxwrap);

    }
    public int kadanes(int []nums){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int el:nums){
            currSum+=el;
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
}
// Find the maximum subarray sum without wrapping using Kadane's algorithm.
// Then invert the array so that the minimum subarray becomes the maximum subarray.
// The maximum circular sum is obtained by removing the minimum subarray from the total sum.
// Handle the special case where all elements are negative by returning the normal Kadane result.