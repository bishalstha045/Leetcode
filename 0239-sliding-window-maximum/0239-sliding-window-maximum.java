class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>d =new ArrayDeque<>();
        int[]res =new int[nums.length-k+1];
        int left=0;
        int index=0;
        for(int right=0;right<nums.length;right++){
            while(!d.isEmpty() && nums[d.peekLast()]<=nums[right]){
                d.pollLast();
            }
            d.offerLast(right);
            if(d.peekFirst()<left){
                d.pollFirst();
            }
            if((right-left+1)==k){
                res[index++]=nums[d.peekFirst()];
                left++;
            }
        }
        return res;
    }
}
// left marks the start of the sliding window
// dq stores indices of useful elements in decreasing order of values
// Remove smaller elements from the back since they cannot be maximum
// Add the current element's index
// Remove elements that are outside the current window
// Once window size becomes k, the front of deque is the maximum
// Store the maximum and move the left pointer forward
// Return the result array