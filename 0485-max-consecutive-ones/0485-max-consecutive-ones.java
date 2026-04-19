class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int comparecount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else if(nums[i]==0){
                count=0;
            }
            if(comparecount<count){
                comparecount=count;
            }
        }
        return comparecount;
    }
}