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
/*
//Hashing approach:
firstly findout small and big element from array
after that traverse through the array and count out the frequency
if any element with frequency not equals to 1 add it into arraylist 
since the question says list element should be in sorted order , so traverse from small to big
return ans
 */