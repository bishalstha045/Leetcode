class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int minprefixsum=0;// because if elements in array are positive then start value will be 0
        for(int el:nums){
            sum+=el;
            minprefixsum=Math.min(minprefixsum,sum);
        }
        int start = 1-minprefixsum; //because start+minprefix>=1 to make an array sum always positive
        return start;
    }
}