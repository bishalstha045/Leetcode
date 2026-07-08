
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char ch : magazine.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch:ransomNote.toCharArray()) {
            freq[ch - 'a']--;
            if (freq[ch - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}

/*
Approach: Initialize a frequency array of size 26 to store the count of each lowercase letter. Traverse the magazine string and update the frequency of every character. Then, traverse the ransomNote string and decrement the corresponding frequency. If any frequency becomes negative, return false since the required character is unavailable. If the traversal completes successfully, return true.
*/

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         // Count characters in magazine
//         for (char ch : magazine.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         Check ransom note
//         for (char ch : ransomNote.toCharArray()) {
//             if (!map.containsKey(ch) || map.get(ch) == 0) {
//                 return false;
//             }
//             map.put(ch, map.get(ch) - 1);
//         }
//         return true;
//     }
// }

/*
    Approach: Create a HashMap<Character, Integer> to store the frequency of each character in the magazine. Traverse the magazine and populate the map with character counts. Next, iterate through the ransomNote. For each character, check if it exists in the map with a positive count. If not, return false. Otherwise, decrement its count in the map. If all characters are processed successfully, return true.
*/