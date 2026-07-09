class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map= new HashMap<>();
        for(String str:strs){
            char []ch = str.toCharArray();
            Arrays.sort(ch);
            String key= new String(ch);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
/*
We use a HashMap where the key is the sorted version of each string.
Since all anagrams become identical after sorting, they get grouped under
the same key. Finally, we return all the grouped lists from the HashMap.
*/