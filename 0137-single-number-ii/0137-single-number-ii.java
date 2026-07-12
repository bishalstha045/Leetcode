class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int el:nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        int ans=0;
        for(int el:map.keySet()){
            if(map.get(el)==1)ans=el;
        }
        return ans;
    }
}
/*
Approach:
- Use a HashMap to count the frequency of each number.
- Traverse the map and find the number whose frequency is 1.
- Return that number as it appears only once.
*/

//for solving in O(1) space time, it is only possible through bit manipulation, i will do it after learning bitmanipulation