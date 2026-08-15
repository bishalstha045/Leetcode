class Solution {
    public boolean isMonotonic(int[] nums) {
       boolean asc=true;
       boolean des=true;
       for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]) des=false;
       }
       for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) asc=false;
       }
       if(asc || des) return true;
        return false;
    }
}
