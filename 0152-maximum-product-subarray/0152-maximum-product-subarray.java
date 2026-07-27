class Solution {
    public int maxProduct(int[] nums) {
        int currproduct=1;
        int maxproduct=Integer.MIN_VALUE;
        //from left to right
        for(int el:nums){
            currproduct*=el;
            maxproduct=Math.max(currproduct,maxproduct);
            if(currproduct==0)currproduct=1;
        }
        currproduct=1;
        //from right to left
        for(int i=nums.length-1;i>=0;i--){
            currproduct*=nums[i];
            maxproduct=Math.max(currproduct,maxproduct);
            if(currproduct==0)currproduct=1;
        }
        return maxproduct;
    }
}
/*
Approach:
Use a running product while traversing the array from left to right and update
the maximum product at each step. Reset the running product to 1 whenever a 0
is encountered because any subarray crossing 0 will have a product of 0.
A single traversal is not enough since an odd number of negative values may
prevent the maximum product from being found. Therefore, perform another
traversal from right to left. This second pass handles cases where the optimal
subarray starts after the first negative or ends before the last negative.
Time Complexity: O(n)
Space Complexity: O(1)
*/