class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq= new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            if(freq[ch-'a']==0)return ch;
            freq[ch-'a']--;
        }
        return ' ';
    }
}
/*
Approach:
1. Count the frequency of each character in string 's'.
2. Traverse string 't':
   - If the frequency of the current character is 0, it is the extra character.
   - Otherwise, decrement its frequency.
3. Return the extra character.
Time Complexity: O(n)
Space Complexity: O(1)   // Fixed-size array of 26 characters
*/


// class Solution {
//     public char findTheDifference(String s, String t) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         // Count frequency of characters in s
//         for (char ch : s.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         // Check characters in t
//         for (char ch : t.toCharArray()) {
//             if (!map.containsKey(ch) || map.get(ch) == 0) {
//                 return ch;
//             }
//             map.put(ch, map.get(ch) - 1);
//         }
//         return ' ';
//     }
// }

/*
Approach:
1. Store the frequency of each character from string 's' in a HashMap.
2. Traverse string 't':
   - If a character is not present in the map or its count is 0, it is the extra character.
   - Otherwise, decrement its count in the map.
3. Return the extra character.
Time Complexity: O(n)
Space Complexity: O(k)
where k = number of distinct characters.
*/