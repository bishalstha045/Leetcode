class Solution {
    public int[] getConcatenation(int[] nums) {
         int n=nums.length;
         int []ans= new int[2*n];
         for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
         }
         return ans;
    }
} 
/*
create a new array ans with twice the size of original array
then transfer element till n and after n separately while traversing till n
 */