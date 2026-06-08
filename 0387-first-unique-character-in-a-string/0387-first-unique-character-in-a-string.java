class Solution {
    public int firstUniqChar(String s) {
        int freq[] =new int[26];
        for(int i=0;i<s.length();i++){
            int ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(freq[ch-'a']==1) return i;
        }
        return -1;
    }
}
// first step is to find the frequency of all the character
// then check whose frequency equals 1 then return it imediately