class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set= new HashSet<>();
        for(char el:jewels.toCharArray()){
            set.add(el);
        }
        int ans=0;
        for(char el:stones.toCharArray()){
            if(set.contains(el))ans++;
        }
        return ans;
    }
}
/*
Approach:
- Store all jewel characters in a HashSet for fast lookup.
- Traverse each stone and check if it exists in the HashSet.
- Count every matching stone and return the total.
*/