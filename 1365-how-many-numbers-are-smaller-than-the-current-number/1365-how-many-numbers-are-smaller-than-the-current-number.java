class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int []count = new int[n];
        for(int i=0; i<n; i++){
            int c=0;
            for(int j=0;j<n;j++){ // to check with all other element
                if(nums[i]>nums[j]){
                    c++;
                }
            }
            count[i]=c;
        }
        return count;
    }
}
// its time complexity is O(n2) , i will later solve it using prefix sum technique 