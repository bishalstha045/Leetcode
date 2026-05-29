class Solution {

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m = nums1.length, n = nums2.length;
        int[] ans = new int[k];

        int start = Math.max(0, k - n);
        int end = Math.min(k, m);

        for (int i = start; i <= end; i++) {
            int[] part1 = maxSubsequence(nums1, i);
            int[] part2 = maxSubsequence(nums2, k - i);

            int[] candidate = merge(part1, part2);

            if (greater(candidate, 0, ans, 0)) {
                ans = candidate;
            }
        }

        return ans;
    }

    private int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        int[] stack = new int[k];
        int top = -1;
        int drop = n - k;

        for (int num : nums) {
            while (top >= 0 && stack[top] < num && drop > 0) {
                top--;
                drop--;
            }

            if (top + 1 < k) {
                stack[++top] = num;
            } else {
                drop--;
            }
        }

        return stack;
    }

    private int[] merge(int[] a, int[] b) {
        int[] res = new int[a.length + b.length];
        int i = 0, j = 0, idx = 0;

        while (i < a.length || j < b.length) {
            if (greater(a, i, b, j)) {
                res[idx++] = a[i++];
            } else {
                res[idx++] = b[j++];
            }
        }

        return res;
    }

    private boolean greater(int[] a, int i, int[] b, int j) {
        while (i < a.length && j < b.length && a[i] == b[j]) {
            i++;
            j++;
        }

        if (j == b.length) return true;
        if (i == a.length) return false;

        return a[i] > b[j];
    }
}
// Try every possible split of k digits between nums1 and nums2.
// For each split:
// 1. Build the maximum subsequence from both arrays using a monotonic stack.
// 2. Merge them greedily by comparing remaining suffixes lexicographically.
// 3. Keep the lexicographically largest result.
// Time: O(k(m+n))
// Space: O(k)