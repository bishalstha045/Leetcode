// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(i!=nums[i]){
//                 return i;
//             }
//         }
//         return n;

//     }
// } //time complexity O(nlog(n))

class Solution{
    public int missingNumber(int[] nums){
        int n=nums.length;
        int expected =n*(n+1)/2;
        int actual=0;
        for(int i=0;i<n;i++){
            actual+=nums[i];
        }
        
        return expected-actual;
    }
}
//time complexity O(n)