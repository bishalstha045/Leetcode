class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
       return atmost(nums,goal) - atmost(nums,goal-1);
    }
    public int atmost(int []nums,int goal){
        if(goal<0)return 0; //edge case
        int left=0;
        int count=0;
        int sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>goal){
                sum-=nums[left];
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}
/*
Count subarrays with sum exactly equal to goal using:
Exactly(goal) = AtMost(goal) - AtMost(goal - 1).
The sliding window counts all subarrays with sum at most 'goal'. For each valid window,
(right - left + 1) gives the number of valid subarrays ending at the current index.
If goal < 0, return 0 since a binary array cannot have a negative sum.
Time: O(n)
Space: O(1)
*/


// class Solution {
//     public int numSubarraysWithSum(int[] nums, int goal) {
//         HashMap<Integer,Integer> map= new HashMap<>();
//         map.put(0,1);
//         int prefix=0;
//         int count=0;
//         for(int el:nums){
//             prefix+=el;
//             if(map.containsKey(prefix-goal)){
//                 count+=map.get(prefix-goal);
//             }
//                 map.put(prefix,map.getOrDefault(prefix,0)+1);
//         }
//         return count;
//     }
// }
/*
Approach:
- Use Prefix Sum + HashMap to count subarrays with sum equal to the goal.
- Store the frequency of each prefix sum in the HashMap.
- For each element, update the current prefix sum.
- If (prefixSum - goal) exists in the map, its frequency represents the number
  of previous prefixes that form a valid subarray ending at the current index.
- Add that frequency to the answer, then update the current prefix sum frequency.
- Time Complexity: O(n)
- Space Complexity: O(n)
*/