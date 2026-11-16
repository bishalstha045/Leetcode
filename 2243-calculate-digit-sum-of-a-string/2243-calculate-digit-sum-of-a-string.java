class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder ans = new StringBuilder();
            for(int i=0;i<s.length();i=i+k){
                int sum=0;
                for(int j=i;j<Math.min(i+k,s.length());j++){
                    sum+=s.charAt(j)-'0';
                }
                ans.append(sum);
            }
            s=ans.toString();
        }
        return s;
    }
}
// Keep grouping the string into chunks of k, calculate each group's digit sum,
// and build a new string until its length becomes <= k.