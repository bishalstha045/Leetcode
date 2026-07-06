class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int el:nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        for(int el:map.keySet()){
            int count=map.get(el);
            max=Math.max(max,count);
        }
        int result=0;
        for(int el:map.keySet()){
            if(map.get(el)==max) result+=map.get(el);   
        }
        return result;
    }
}
/*
approach: hashmap frequency count pattern
time:O(n);

 */