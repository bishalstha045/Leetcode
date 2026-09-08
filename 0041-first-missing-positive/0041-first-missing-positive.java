class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int el:nums){
            set.add(el);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i))return i;
        }
        return nums.length+1;
   }
}
/*
The idea is to store all the numbers in a HashSet so we can quickly check whether a positive number exists.
Then we check numbers starting from 1 up to the length of the array. The first number that is not present in the set is the first missing positive number.
If all numbers from 1 to n are present, then the answer will be n + 1.
Time Complexity: O(n)
Space Complexity: O(n)
*/