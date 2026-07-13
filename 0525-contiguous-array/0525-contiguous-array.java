class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)nums[i]=-1;
        }
        int prefix=0;
        int longest=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            if(map.containsKey(prefix)){
                longest=Math.max(longest,i-map.get(prefix));
            }
            else{
            map.put(prefix,i);
            }
        }
        return longest;
    }
}
/*
Approach:
- Convert every 0 into -1 so that a subarray with equal numbers of 0s and 1s has a sum of 0.
- Use a prefix sum and HashMap to store the first occurrence of each prefix sum.
- Whenever the same prefix sum is seen again, the elements between the two indices form
  a balanced subarray. Update the maximum length accordingly.
- Store only the first occurrence of each prefix sum to maximize the subarray length.
Time Complexity: O(n)
Space Complexity: O(n)
*/