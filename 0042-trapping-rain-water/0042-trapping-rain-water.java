class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        // store maximum height from the left
        left[0] = height[0];
        for(int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        // store maximum height from the right
        right[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        // calculate trapped water
        for(int i = 0; i < n; i++) {
            int waterHeight = Math.min(left[i], right[i]);
            total += waterHeight - height[i];
        }
        return total;
    }
}
/*
    For every index, I need the tallest bar on the left
    and the tallest bar on the right.
    So first I store all left maximums in left[].
    Then I store all right maximums in right[].
    The smaller of left and right decides the water level.
        water= min(left[i], right[i]) - height[i]
    Finally, I add the water for every index.
    Instead of finding left and right maximum again and again,
    I calculate them once, so the time becomes O(n).
*/