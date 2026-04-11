class Solution {
    public void sortColors(int[] nums) {
    int n=nums.length;
    int noZeros=0;
    int noOnes=0;
    int noTwos=0;
    for(int el : nums){
        if(el==0) noZeros++;
        else if(el==1) noOnes++;
        else if(el==2) noTwos++;
    }
    for(int i=0;i<noZeros;i++){
        nums[i]=0;
    }
    for(int i=noZeros;i<noOnes + noZeros;i++){
        nums[i]=1;
    }
    for(int i=noZeros+noOnes;i<n;i++){
        nums[i]=2;
    }
    }
}