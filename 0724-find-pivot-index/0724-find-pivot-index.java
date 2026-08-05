class Solution {
    public int pivotIndex(int[] nums) {
    //first we need to find total sum
    int totalsum=0;
    for(int el: nums){
        totalsum+=el;
    }
    // we need to find left sum but initially at leftmost side it is 0
    int leftsum=0;
    for(int i=0;i<nums.length; i++){
        int rightsum=totalsum-leftsum -nums[i];
        if(leftsum == rightsum) return i;
        leftsum+=nums[i];
    }
    return -1;
    }
}