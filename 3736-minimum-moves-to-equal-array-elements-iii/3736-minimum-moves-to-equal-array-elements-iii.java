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
// Find the maximum element and calculate the difference of every element from it.
// Total difference gives the minimum moves required to make all elements equal.