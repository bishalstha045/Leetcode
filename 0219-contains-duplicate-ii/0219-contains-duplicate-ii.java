class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}

/*
Approach:
1. Use HashMap to store number and its latest index.
2. Traverse array.
3. If current number already exists in map,
   check difference between current index and previous index.
4. If difference <= k, return true.
5. Otherwise update latest index.
6. If no duplicates found within range k, return false.

Time Complexity: O(n)
Space Complexity: O(n)
*/