// class Solution {
//     public int singleNumber(int[] nums) {
//     int []freqarr = frequencyarray(nums);
//     for(int i=0; i<nums.length ; i++){
//         int el = nums[i];
//         if(freqarr[el]== 1){
//             return el;
//         }
//     }
//     return -1;
//     }
//     public int[] frequencyarray(int []arr){
//         int []freq = new int[100002];
//         for(int i=0;i<arr.length; i++){
//             freq[arr[i]]++;
//         }
//         return freq;
//     }
// } // it's space complexity is linear but question says to so do it in constant space complexity

class Solution{
    public int singleNumber(int[] nums){
        int ans=0;
        for(int el : nums){
            ans= ans ^ el ;
        }
        return ans;
    }
}

// Approach: XOR (Bit Manipulation)
// - XOR of a number with itself is 0 (a ^ a = 0)
// - XOR of a number with 0 is the number itself (a ^ 0 = a)
// - XOR is commutative and associative
// So, when we XOR all elements, duplicate numbers cancel out,
// and only the unique number remains.
//
// Time Complexity: O(n)
// Space Complexity: O(1)