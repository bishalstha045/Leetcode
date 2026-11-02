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