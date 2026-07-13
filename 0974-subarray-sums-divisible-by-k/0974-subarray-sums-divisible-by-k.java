class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix=0;
        int count=0;
        for(int el:nums){
            prefix+=el;
            int rem=prefix%k;
             if(rem<0){
                    rem+=k;
                }
            if(map.containsKey(rem)){ //count += map.getOrDefault(rem, 0); same instead of if condition 
                count+=map.get(rem);
            }
             map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}