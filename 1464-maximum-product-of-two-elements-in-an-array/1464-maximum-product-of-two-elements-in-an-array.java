class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        //max1=0,max2=0 will also work since for this question nums[i]>=1
    for(int i=0;i<nums.length;i++){
        if(nums[i]>max1){
            max2=max1;
            max1=nums[i];
        }
       else if(nums[i]>max2){
            max2=nums[i];
        }
    }
    return (max1-1)*(max2-1);
}
}
//time complexity 0(n)
// import java.util.Arrays;
//  class Solution {
//     public int maxProduct(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         return (nums[n-1]-1)*(nums[n-2]-1);
//     }
//  }
//its time complexity 0(nlogn)