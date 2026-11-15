class Solution {
    public boolean checkIfPangram(String sentence) {
        int[]freq=new int[26];
        for(char el:sentence.toCharArray()){
            freq[el-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]<1)return false;
        }
        return true;
    }
}