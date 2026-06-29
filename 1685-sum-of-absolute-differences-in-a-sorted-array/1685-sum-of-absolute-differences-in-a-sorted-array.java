class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int result[] = new int[n];
        int total=0;
        for(int el: nums){
            total+=el;
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            int rightsum=total - leftsum-nums[i];
            int left= nums[i]*i - leftsum;
            int right= rightsum- nums[i]*(n-i-1);
            result[i]=left+right;
            leftsum+=nums[i];
        }
        return result;
    }
}
/*

    firstly calculate total sum of the array
    then find out the leftsum for that use a for loop
    in each iteration findout rightsum
    then inside that loop for each iteration create left and right variables that will store values of leftsum and rightsum by subtracting the elment how many times it occurs 

    for example when i is at 2 then it will subtract leftsum 2 times from the same element and as pivot i.e current element is already subtracted while calculating rightsum so no need to subtract it extra times

    then simply put left and right for each iteration in result array
    */