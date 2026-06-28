class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []ans = new int[n];
        // firstly finding left mul of each index
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        // now multiplying with right sides
        int right=1;
        for(int i=n-1;i>=0;i--){
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
}
// First, store the product of all elements to the left of each index in the answer array.
// Then traverse from right to left while maintaining a running right-side product.
// Multiply the left product (already stored) with the current right product to get the final answer.
// This avoids division and solves the problem in O(n) time with O(1) extra space (excluding the output array).
