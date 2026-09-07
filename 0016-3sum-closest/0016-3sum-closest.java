class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[0] + nums[1] + nums[2]; 
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
                if (sum == target) return target;
                else if (sum < target) left++;
                else right--;
            }
        }
        return result;
    }
}
// First, I sort the array so that I can use the two-pointer approach.
// I fix one element using i, and then use two pointers:
// left starts just after i and right starts from the end.
// For every combination, I calculate the sum of the three numbers.
// If the current sum is closer to the target than my previous result,
// I update the result.
// Now I move the pointers based on the sum:
// - If sum is smaller than target, I need a bigger sum, so I move left forward.
// - If sum is greater than target, I need a smaller sum, so I move right backward.
// - If sum equals target, I have found the exact answer, so I return it immediately.
// I repeat this for every possible fixed element and finally return
// the closest sum found.
// Time Complexity: O(n²)
// Space Complexity: O(1) auxiliary space