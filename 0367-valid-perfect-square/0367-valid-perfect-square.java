class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;

        long low = 1, high = num;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }
}

    // Binary Search on range [1, num]
    // Check mid*mid == num; use long to avoid overflow
    // Time: O(log n), Space: O(1)