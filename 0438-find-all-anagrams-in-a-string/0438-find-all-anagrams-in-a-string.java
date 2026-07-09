class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> ans= new ArrayList<>();
            if(s.length()<p.length())return ans;
            int[]pfreq= new int[26];
            int[]wfreq=new int[26];
            for(char el:p.toCharArray()){
                pfreq[el-'a']++;
            }
            int left=0;
            for(int right=0;right<s.length();right++){
                char r=s.charAt(right);
                wfreq[r-'a']++;
                if((right-left+1)>p.length()){
                    char l= s.charAt(left);
                    wfreq[l-'a']--;
                    left++;
                }
                if(Arrays.equals(pfreq,wfreq))ans.add(left);
            }
            return ans;
    }
}
/*
I solved this problem using a fixed-size sliding window and two frequency arrays.
One array stores the frequency of characters in the pattern, while the other
stores the frequency of the current window in the string. As the window slides,
I add the new character and remove the leftmost character to maintain the window
size. Whenever both frequency arrays become equal, it means the current window
is an anagram of the pattern, so I store its starting index.
*/




// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> ans = new ArrayList<>();
//         if (s.length() < p.length()) return ans;
//         HashMap<Character, Integer> pMap = new HashMap<>();
//         HashMap<Character, Integer> window = new HashMap<>();
//         // Pattern frequency
//         for (char ch : p.toCharArray()) {
//             pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
//         }
//         int left = 0;
//         for (int right = 0; right < s.length(); right++) {
//             char ch = s.charAt(right);
//             window.put(ch, window.getOrDefault(ch, 0) + 1);
//             // Shrink window
//             if (right - left + 1 > p.length()) {
//                 char leftChar = s.charAt(left);
//                 window.put(leftChar, window.get(leftChar) - 1);
//                 if (window.get(leftChar) == 0) {
//                     window.remove(leftChar);
//                 }
//                 left++;
//             }
//             // Compare both maps
//             if (window.equals(pMap)) {
//                 ans.add(left);
//             }
//         }
//         return ans;
//     }
// }
/*
I used a fixed-size sliding window along with two HashMaps to store the character
frequencies of the pattern and the current window. While moving the window, I
update the frequency of the entering and leaving characters. After each update,
I compare both HashMaps, and if they are equal, it means the current window is
an anagram of the pattern, so I add its starting index to the answer list.
*/