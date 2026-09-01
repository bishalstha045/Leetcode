class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int right=0;right<s.length();right++){
            char ri=s.charAt(right);
            if(vowel(ri))count++;
            while((right-left+1)>k){
                char le=s.charAt(left);
                if(vowel(le))count--;
                left++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public boolean vowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'|| ch=='u')return true;
        return false;
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