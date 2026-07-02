class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxavg=-Double.MAX_VALUE;//here, Double.MIN_VALUE will be minimum positive value but in this question negative values are also possible that is why we have to choose negative infinity which can be processed either by using -Double.MAX_VALUE or Double.NEGATIVE_INFINITY
        int left=0;
        int sum=0;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            if((right-left+1)>k){
                sum-=nums[left];
                left++;
            }
            if((right-left+1)==k){   
                maxavg=Math.max(maxavg,(double)sum/k);
            }
        }
        return maxavg;
    }
}
/*
I used a fixed-size sliding window to keep track of the sum of every subarray of size `k`. As the window moves, I add the new element and remove the leftmost one to maintain the window size. For each valid window, I calculate its average and update the maximum average found.
*/