class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer>map=new HashMap<>();
        int left=0;
        int count=0;
        for(int right=0;right<s.length();right++){
            char ri=s.charAt(right);
            map.put(ri,map.getOrDefault(ri,0)+1);
            while((right-left+1)>map.size()){
                char le=s.charAt(left);
                map.put(le,map.get(le)-1);
                if(map.get(le)==0)map.remove(le);
                left++;
            }
            count=Math.max(count,right-left+1);
        }
        return count;
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