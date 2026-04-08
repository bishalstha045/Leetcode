class Solution {

    public int findKthLargest(int[] nums, int k) {
        int n =nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(k==(n-i)){
                return nums[i];
            }
        }
        return -1;

    }
    
}
// using sorting as of now , i will do it letter using heap/quick sort for without sorting 
///time complexity= O(nlogn)