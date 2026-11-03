class Solution {
    public int minMoves(int[] nums) {
        int res=0;
        int max=Integer.MIN_VALUE;
        for(int el:nums){
            max=Math.max(max,el);
        }
        for(int i=0;i<nums.length;i++){
            res+=(max-nums[i]);
        }
        return res;
    }
}