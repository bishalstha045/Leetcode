class Solution {
    public boolean isMonotonic(int[] nums) {
       int j=1;
       boolean asc=true;
       boolean des=true;
       for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]) des=false;
       }
       for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) asc=false;
       }
       if(asc || des) return true;
       else  return false;
    }
}


// class Solution {
//     public boolean isMonotonic(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//            if(isDecreasing(nums) ||isIncreasing(nums))return true;
//         }
//         return false;
//     }
//     boolean isDecreasing(int []nums){
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]>nums[i-1]) return false;
//         }
//      return true;
//     }
//      boolean isIncreasing(int []nums){
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]<nums[i-1]) return false;
//         }
//      return true;
//     }
// }