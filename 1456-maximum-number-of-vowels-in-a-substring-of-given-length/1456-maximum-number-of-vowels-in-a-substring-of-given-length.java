class Solution {
    public int maxVowels(String s, int k) {
       int left=0;
       int max=0;
       int count=0;
       for(int right=0;right<s.length();right++){
            if(isvowel(s.charAt(right))) count++;
            if((right-left+1)>k){
                if(isvowel(s.charAt(left))){
                    count--;
                }
                left++;
            }
            if((right-left+1)==k){
                max=Math.max(max,count);
            }
       }
       return max; 
    }
    public boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}
/*
    Intuition:
    Instead of checking every substring separately, I use a sliding window of
    size k. I keep track of the number of vowels in the current window. When
    the window moves forward, I add the new character if it is a vowel and
    remove the leftmost character if it is a vowel. This way, the vowel count
    is updated efficiently without recounting the entire window. Whenever the
    window size becomes k, I update the maximum vowel count found so far.
 */