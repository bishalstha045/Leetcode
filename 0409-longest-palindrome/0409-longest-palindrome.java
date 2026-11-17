class Solution {
    public int longestPalindrome(String s) {
        int []freq=new int[126];
        int ans=0;
        for(char ch: s.toCharArray()){
            freq[ch]++;
        }
        for(int el:freq){
            if(el%2==0){
                ans+=el;
            }
            else{
                ans+=el-1;
            }
        }
        if(ans<s.length()) ans=ans+1;
        return ans;
    }
}