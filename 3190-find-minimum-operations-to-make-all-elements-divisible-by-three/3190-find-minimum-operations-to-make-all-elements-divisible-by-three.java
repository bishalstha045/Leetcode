class Solution {
    public int minimumOperations(int[] nums) {
        int res=0;
        for(int el:nums){
            if(el%3==0)continue;
            else if(el==1)res++;
            else res++;
        }
        return res;
    }
}