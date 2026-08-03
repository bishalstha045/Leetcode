class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int max=0;
       for(int el:nums){
        max=Math.max(el,max);
       }
       int left=1;
       int right=max;
       int ans=-1;
       while(left<=right){
        int mid=left+(right-left)/2;
        if(divSum(nums,mid)<=threshold){
            ans=mid;
            right=mid-1;
        }
        else left=mid+1;
       }
       return ans;
    }
    public int divSum(int []nums,int mid){
        int sum=0;
        for(int el:nums){
            sum+=Math.ceil((double)el/mid);
        }
        return sum;
    }
}

// Binary Search on the answer.
// Search for the divisor between 1 and the maximum element.
// Calculate the sum using the current divisor.
// If the sum is within the threshold, store the answer and try a smaller divisor.
// Otherwise, search for a larger divisor.

// class Solution {
//     public int smallestDivisor(int[] nums, int threshold) {
//         int max=0;
//         for(int el:nums){
//             max=Math.max(el,max);
//         }
//         for(int d=1;d<=max;d++){
//             int sum=0;
//             for(int i=0;i<nums.length;i++){
//                 sum+=Math.ceil((double)nums[i]/d);
//             }
//             if(sum<=threshold)return d;
//         }
//         return -1;
//     }
// }
// Brute Force Approach
// Find the maximum element to know the highest possible divisor.
// Try every divisor from 1 to max.
// For each divisor, calculate the sum of ceil(num/divisor).
// If the sum is within the threshold, return that divisor.
// Since we check divisors in increasing order, the first valid one is the answer.