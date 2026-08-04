class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int small=Integer.MAX_VALUE;
        int big=Integer.MIN_VALUE;
        for(int el:nums){
            big=Math.max(big,el);
            small=Math.min(small,el);
        }
        int[]freq=new int[101];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=small;i<=big;i++){
            if(freq[i]!=1)ans.add(i);
        }
        return ans;
    }
}