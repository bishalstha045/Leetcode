class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix+=nums[i];
            int rem=prefix%k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2)return true;
            }
            else map.put(rem,i); //stores first occurence of remainder
        }
        return false;
    }
}
/*
Approach:
- Use a HashMap to store the first index where each prefix sum remainder (prefix % k) appears.
- If the same remainder is seen again, the subarray between those indices has a sum divisible by k.
- Return true only if the subarray length is at least 2; otherwise continue.
- Time: O(n), Space: O(min(n, k))
*/