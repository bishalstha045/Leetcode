class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public int atMost(int[] nums, int k) {
        int left=0;
        int count=0;
        int odd=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]%2==1)odd++;
            while(odd>k){
                if(nums[left]%2==1)odd--;
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}
/*

```java
/*
Approach:
Instead of counting subarrays with exactly k odd numbers directly,
I first count the number of subarrays having at most k odd numbers 
and then count the number of subarrays having at most (k-1) odd numbers.
The difference between these two counts gives the number of subarrays with exactly k odd
numbers. I use a sliding window where I expand the right pointer
and keep track of the number of odd elements in the current window.
If the number of odd elements becomes greater than k, I shrink the window
from the left until it becomes valid again. For every valid window, all subarrays ending at
the current index are valid, so I add (right - left + 1) to the answer.
Time Complexity: O(n)
Space Complexity: O(1)
*/
