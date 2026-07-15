class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        int []freq=new int[n+1];
       for(int el:nums){
        freq[el]++;
       }
        for(int i=1;i<=n;i++){
            if(freq[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}
// Store the frequency of each number.
// Any number from 1 to n with frequency 0 is missing.
 // Time: O(n)
 // Space: O(n)