class Solution {
    int mostFreq(int []freq){
            int count= Integer.MIN_VALUE;
            for(int i=0;i<26;i++){
                count=Math.max(count,freq[i]);
            }
            return count;
        }
        int leastFreq(int []freq){
            int count= Integer.MAX_VALUE;
            for(int i=0;i<26;i++){
                count=Math.min(count,freq[i]);
            }
            return count;
        }
    public int beautySum(String s) {
        int result=0;
        for(int i=0;i<s.length();i++){
            int[]freq= new int[26];
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int beauty= mostFreq(freq)-leastFreq(freq);
                result+=beauty;
            }
        }
        return result;
    }
}