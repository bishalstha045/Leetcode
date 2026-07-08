class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
/*
Approach:
1. Traverse the array while storing each element and its index in a HashMap.
2. For every element, calculate its complement (target - current element).
3. If the complement already exists in the HashMap, return the indices of the complement and the current element.
4. Otherwise, store the current element and its index in the HashMap and continue.
Time Complexity: O(n)
Space Complexity: O(n)
*/
