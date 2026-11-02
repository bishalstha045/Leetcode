class Solution {
    public int minMoves2(int[] nums) {
        int res=0;
        Arrays.sort(nums);
        int median=nums[nums.length /2];
        for(int el:nums){
            res+= Math.abs(median-el);
        }
        return res;
    }
}
// Sort the array and find the median.
// Median minimizes the total absolute difference.
// Sum |element - median| to get minimum moves.