class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int count=0;
        for(int el:nums){
            prefix+=el;
            if(map.containsKey(prefix-goal)){
                count+=map.get(prefix-goal);
            }
                map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return count;
    }
}
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