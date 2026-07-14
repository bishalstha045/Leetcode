class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char r=s.charAt(right);
            map.put(r,map.getOrDefault(r,0)+1);
            while((right-left+1)>map.size()){
                char l=s.charAt(left);
                map.put(l,map.get(l)-1);
                if(map.get(l)==0)map.remove(l);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}
/*
Approach:
- Use a sliding window and HashMap to track character frequencies.
- Expand the window with the right pointer.
- If a duplicate appears, shrink the window from the left until all characters are unique.
- Keep updating the maximum valid window length.
Time: O(n)
Space: O(n)
*/