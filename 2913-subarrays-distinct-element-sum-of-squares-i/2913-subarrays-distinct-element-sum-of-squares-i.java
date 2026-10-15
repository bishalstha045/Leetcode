
class Solution {
    public int sumCounts(List<Integer> nums) {
        int n = nums.size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(nums.get(j));
                int distinct = set.size();
                sum += distinct * distinct;
            }
        }
        return sum;
    }
}
/*
- Initialize the array length and sum.
- Use the outer loop to select the starting index.
- Create a HashSet to store distinct elements.
- Use the inner loop to generate subarrays.
- Add each element to the HashSet.
- Square the distinct count and add it to the sum.
- Return the final sum.
 */