class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[0]*nums[1]*nums[n-1] , nums[n-3]*nums[n-1]*nums[n-2]);
    }
}
// Sort the array and compare two cases:
// 1. Two smallest (negative) elements * largest element.
// 2. Product of the three largest elements.
// Return the maximum product.