class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]<0){
                 ans.add(Math.abs(nums[i]));
            }
            else{
               nums[index]=-nums[index];
            }
        }
        return ans;
    }
}
// Since every number is in the range [1, n], we can use each value as an index.
// For every number, we visit its corresponding index (value - 1). If the value at
// that index is positive, we mark it as visited by making it negative. If it is
// already negative, it means we have seen that number before, so it is a duplicate.
// This allows us to find all duplicates in O(n) time using O(1) extra space.