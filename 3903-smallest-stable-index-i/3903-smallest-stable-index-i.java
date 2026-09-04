class Solution {
    public int firstStableIndex(int[] nums, int k) {
       for(int i=0;i<nums.length;i++){
            if(score(nums,i)<=k){
                return i;
            }
       }
       return -1; 
    }
    public int score(int []nums,int i){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int j=0;j<=i;j++){
            max=Math.max(max,nums[j]);
        }
        for(int j=i;j<nums.length;j++){
            min=Math.min(min,nums[j]);
        }
        return max-min;
    }
}
/*
   Check each index from left to right.
   Find max from 0 to i and min from i to end.
   If max - min <= k, return i.
   First valid index is the smallest one.
   Time: O(n^2)
   Space: O(1)
*/