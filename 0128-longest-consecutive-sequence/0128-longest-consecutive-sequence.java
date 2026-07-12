class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int el:nums){
            set.add(el);
        }
        int longest=0;
        for(int el:set){
            if(!set.contains(el-1)){
                int curr=el;//it is tracking current number
                int length=1; //it is tracking number int this sequence
            while(set.contains(curr+1)){
                curr++;
                length++;
            }
            longest=Math.max(longest,length);
        }
        }
        return longest;
    }
}
/*
Approach:
- Store all numbers in a HashSet for O(1) lookup.
- A number starts a sequence only if its previous number (num - 1) is not in the set.
- From each starting number, keep checking the next consecutive numbers
  and count the sequence length.
- Update the maximum length after each sequence.
Time Complexity: O(n)
Space Complexity: O(n)
*/




// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0)return 0;
//         Arrays.sort(nums);
//         int longest=1;
//         int curr=1;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i-1]==nums[i])continue;
//             if(nums[i]==nums[i-1]+1){
//                 curr++;
//             }
//             else{
//                 longest=Math.max(longest,curr);
//                 curr=1;
//             }
//         }
//         return Math.max(curr,longest); //if the input is already in a sequence then else part will not be executed
//     }
// }
/*
Approach:
- Sort the array so consecutive numbers become adjacent.
- Traverse the sorted array and count the length of each consecutive sequence.
- Skip duplicate values to avoid incorrect counting.
- Whenever the sequence breaks, update the maximum length and start a new count.
- After the loop, compare the last sequence length with the answer.
Time Complexity: O(n log n)
Space Complexity: O(1)
*/