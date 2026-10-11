
class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            // Check whether the current index divides n
            if (n % i == 0) {
                // Add the square of the element at this index
                sum += nums[i - 1] * nums[i - 1];
            }
        }
        return sum;
    }
}
// Get the length of the array
// Initialize sum to 0
// Loop through each index from 1 to n
// Check if n is divisible by the current index
// If divisible, the element is a special element
// Add the square of that element to sum
// Use i - 1 because Java arrays use 0-based indexing
// Return the final sum
