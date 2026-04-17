// class Solution {
//     public int dominantIndex(int[] nums) {
//        int n=nums.length;
//        int max=0;
//        int index=0;
//        for(int i=0;i<n;i++){
//         if(nums[i]>max){
//             max=nums[i];
//             index=i;
//         }
//        }
//        for(int i=0;i<n;i++){
//         if(max < 2*(nums[i]) && i!=index){
//             return -1;
//         }
//        }
//        return index;
//     }
// }

// Steps:
// 1. First loop → find the maximum element and its index.
// 2. Second loop → check if this max is at least twice every other element.
// 3. Skip comparing the max with itself (i != index).
//
// If any element violates the condition → return -1
// Otherwise → return index of max
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int dominantIndex(int[] nums) {
       int n=nums.length;
       int max=0;
       int secondmax=0;
       int index=0;
       for(int i=0;i<n;i++){
        if(nums[i]>max){
            secondmax=max;
            max=nums[i];
            index=i;
        }
        else if(nums[i]>secondmax){
            secondmax=nums[i];
        }
       }
       return (max >= 2* secondmax)? index : -1 ;
    }
}

// Steps:
// 1. Traverse array once.
// 2. Keep track of:
//    - max (largest element)
//    - secondmax (second largest element)
//    - index of max
//
// 3. Update:
//    - If new max found → shift old max to secondmax
//    - Else update secondmax if needed
//
// 4. Final check:
//    if (max >= 2 * secondmax) → return index
//    else → return -1
//
// Time Complexity: O(n)
// Space Complexity: O(1)