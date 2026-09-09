class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            // Maintain decreasing deque for maximum
            while(!maxDeque.isEmpty()&&nums[maxDeque.peekLast()]<nums[right]){
                maxDeque.pollLast();
            }
            maxDeque.offerLast(right);
            // Maintain increasing deque for minimum
            while(!minDeque.isEmpty()&&nums[minDeque.peekLast()]>nums[right]){
                minDeque.pollLast();
            }
            minDeque.offerLast(right);
            // Shrink window if invalid
            while(nums[maxDeque.peekFirst()]-nums[minDeque.peekFirst()]>limit){
                if (maxDeque.peekFirst() == left) {
                    maxDeque.pollFirst();
                }
                if (minDeque.peekFirst() == left) {
                    minDeque.pollFirst();
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
// I need to find the longest subarray where the difference
// between the maximum and minimum is at most the limit.
// I use two deques to keep track of the maximum and minimum
// efficiently. The max deque keeps values in decreasing order,
// while the min deque keeps values in increasing order, so their
// front always gives the current maximum and minimum. I expand
// the window using right, and if max - min becomes greater than
// the limit, I move left forward until the window becomes valid
// again. Finally, I keep updating the maximum length found.