class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character>set= new HashSet<>();
        for(char ch:sentence.toCharArray()){
            set.add(ch);
        }
        return set.size()==26;
    }
}
/*
Approach:
- Use a HashSet to store all unique characters from the sentence.
- Since a HashSet does not allow duplicates, each letter is stored only once.
- If the size of the set becomes 26, then every lowercase alphabet is present,
  so the sentence is a pangram.
Time Complexity: O(n)
Space Complexity: O(1)   // At most 26 letters
*/


// class Solution {
//     public boolean checkIfPangram(String sentence) {
//         HashSet<Character> alpha= new HashSet<>();
//         for(char el='a' ; el<='z';el++){
//             alpha.add(el);
//         }
//         for(char ch:sentence.toCharArray()){
//             alpha.remove(ch);
//         }
//         return alpha.isEmpty()?true:false;
//     }
// }
/*
Approach:
- First, add all lowercase letters ('a' to 'z') into a HashSet.
- Traverse the sentence and remove each encountered character from the set.
- If the set becomes empty after traversal, it means every alphabet
  appeared at least once, so the sentence is a pangram.
*/