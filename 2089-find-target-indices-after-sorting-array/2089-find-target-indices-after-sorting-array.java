class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)ans.add(i);
        }
        return ans;
    }
}
/*
sort the array first
then put index of those elements that maches the target in to list and return
 */