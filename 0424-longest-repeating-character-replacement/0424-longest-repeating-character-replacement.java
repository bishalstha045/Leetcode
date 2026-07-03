class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxfreq=0;
        int result=0;
        int []freq= new int[26];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq, freq[s.charAt(right)-'A']);
            while(((right-left+1)-maxfreq)>k){
                 freq[s.charAt(left)-'A']--;
                 left++;
            }
            result=Math.max(result,right-left+1);
        }
        return result;
    }
}
// Sliding window approach: expand the window while tracking the frequency of each character.
// If the number of replacements needed (window size - highest frequency) exceeds k,
// shrink the window from the left until it becomes valid again. Keep track of the
// maximum valid window size throughout the process.