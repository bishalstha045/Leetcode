class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length && j<=(i+k); j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
}
/*
simple brute force technique to compare the current element and next element then for the second loop case we need to maintain the condition where it says abs(i-j)<=k then we simple compare and return 
its time complexity is bigger than O(n) , after learning hashmap i will use hashmap or hashsheet with sliding window concept to perform optimal solution
*/