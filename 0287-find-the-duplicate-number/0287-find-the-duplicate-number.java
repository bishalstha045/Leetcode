class Solution {
    public int findDuplicate(int[] nums) {
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
            else{
                ans=Math.abs(nums[i]);
            }
        }
        return ans;
    }
}
/*
Approach:
Since every number is in the range [1, n], each value can be mapped to an index (value - 1).
For every element, I visit its corresponding index and mark it as visited by making the value
at that index negative. If I encounter an index that is already negative, it means that number
has been visited before, so it is the duplicate. This approach runs in O(n) time with O(1)
extra space, but it modifies the input array, so it does not satisfy the constraints of
LeetCode 287.
*/