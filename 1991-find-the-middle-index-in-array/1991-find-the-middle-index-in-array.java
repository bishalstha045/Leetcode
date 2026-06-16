//same ans as 724

class Solution {
    public int findMiddleIndex(int[] nums) {
        //first finding out total sum of an array
        int totalsum=0;
        for(int el : nums){
            totalsum+=el;
        }
        //now find left sum while traversing every element and for every element traversed find out the right sum if both are equal then we got our result
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=totalsum-leftsum-nums[i];
            if(leftsum==rightsum) return i;
            leftsum+=nums[i];
        }
        return -1;
    }
}