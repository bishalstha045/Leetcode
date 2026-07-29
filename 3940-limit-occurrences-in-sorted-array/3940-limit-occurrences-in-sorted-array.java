class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
    if(nums.length==0)return nums;
    int j=1;
    int count=1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            count++;
        }
        else count=1;
        if(count<=k){
            nums[j++]=nums[i];
        }
    }
    return Arrays.copyOf(nums,j);
    }
} 
// Approach:
// Since the array is sorted, duplicate elements appear together.
// I use a two-pointer approach where 'j' keeps track of the position
// to place valid elements, and 'count' stores the current occurrence
// of each number. If the occurrence count is within the allowed limit (k),
// the element is copied to the front of the array. Finally, a new array
// containing only the valid elements is returned using Arrays.copyOf().
// Time Complexity: O(n)
// Space Complexity: O(n) (due to Arrays.copyOf() creating a new array)