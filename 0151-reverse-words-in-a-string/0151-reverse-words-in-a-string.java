class Solution {
    public String reverseWords(String s) {
        // String[] word = s.split(" ");//we can split based on space be it may contain multiple leading/trailing spaces
        //that is why we use trim the leading/trialing spaces and also make multiple space as a single separator with \\s+
        String[]word = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i=word.length -1;i>=0;i--){
            ans.append(word[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}