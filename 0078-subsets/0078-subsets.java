class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int idx, int[] nums, List<Integer> temp) {

        ans.add(new ArrayList<>(temp));

        for(int i = idx; i < nums.length; i++) {

            temp.add(nums[i]);

            solve(i + 1, nums, temp);

            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        solve(0, nums, new ArrayList<>());

        return ans;
    }
}
// Backtracking
// Generate all subsets recursively
// Include current element
// Move to next index
// Backtrack by removing element
// Time: O(2^n)
// Space: O(2^n)