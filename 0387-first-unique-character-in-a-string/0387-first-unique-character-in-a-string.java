class Solution {
    public int firstUniqChar(String s) {
        int []freq= new int[26];
        for(int i=0;i<s.length();i++){
            int el=s.charAt(i);
            freq[el-'a']++;
        }
        for(int i=0;i<s.length();i++){
            int ch=s.charAt(i);
            if(freq[ch-'a']==1)return i;
        }
        return -1;
    }
}