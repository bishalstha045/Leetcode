
class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        // XOR all numbers from 0 to n
        for (int i = 0; i <= nums.length; i++) {
            xor ^= i;
        }
        // XOR all array elements
        for (int num : nums) {
            xor ^= num;
        }
        // Numbers appearing twice cancel out
        return xor;
    }
}


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

// class Solution{
//     public int missingNumber(int[] nums){
//         int n=nums.length;
//         int expected =n*(n+1)/2;
//         int actual=0;
//         for(int i=0;i<n;i++){
//             actual+=nums[i];
//         }
        
//         return expected-actual;
//     }
// }
// //time complexity O(n)