class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int i=0;
        while(i<word.length()){
            char ch=word.charAt(i);
            int count=0;
            while(i<word.length() && word.charAt(i)==ch && count<9){
                count++;
                i++;
            }
            ans.append(count);
            ans.append(ch);
        }
        return ans.toString();
    }
}

/*
I have used a single pointer, so firstly i traverse through all the character of the word and created a count variable for counting the occurence of character and i checked the required condition if the count is less that 9 and previous is same as current then count is increased so after that i append count first then character . And for appending i used StringBuilder.

 */