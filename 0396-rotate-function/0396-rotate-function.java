class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        long sum=0;
        long f=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            f+=(long)i*nums[i];
        }
        long ans=f;
        for(int i=n-1;i>0;i--){
            f=f+sum-((long)n*nums[i]);
            ans=Math.max(f,ans);
        }
        return (int)ans;
    }
}
/*
First I calculate the total sum of the array and the initial rotation value F(0). Then instead of actually rotating the array, I use the previous F value to calculate the next one. When the array rotates, every element shifts one position right, so I add the total sum, and the last element needs correction because it moves from the last index to index 0, so I subtract `n * nums[i]`. I keep updating the maximum value in `ans` and finally return it.
 */