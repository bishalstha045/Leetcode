class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> alpha= new HashSet<>();
        for(char el='a' ; el<='z';el++){
            alpha.add(el);
        }
        for(char ch:sentence.toCharArray()){
            alpha.remove(ch);
        }
        return alpha.isEmpty()?true:false;
    }
}
/*
Approach:
- First, add all lowercase letters ('a' to 'z') into a HashSet.
- Traverse the sentence and remove each encountered character from the set.
- If the set becomes empty after traversal, it means every alphabet
  appeared at least once, so the sentence is a pangram.
*/