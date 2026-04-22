class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0)
                continue; // skip odd numbers

            boolean isUnique = true; // created a variable that tracks unique elements

            for (int j = 0; j < n; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return nums[i];
            }
        }

        return -1;
    }
}
// its time complexity is O(n2)
// will do it later using hashmap O(n)