class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int el:arr){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        HashSet<Integer> set= new HashSet<>();
        for(int el:map.values()){
            set.add(el);
        }
        return set.size()==map.size();
    }
}
/*
Approach:
- Count the frequency of each number using a HashMap.
- Store all frequencies in a HashSet.
- If two numbers have the same frequency, the HashSet will remove duplicates.
- If the sizes of the HashMap and HashSet are equal, all frequencies are unique.
- Otherwise, return false.
*/