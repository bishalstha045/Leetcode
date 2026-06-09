class Solution {
    public String reverseWords(String s) {
        String[] word= s.split(" ");
        StringBuilder ans= new StringBuilder();
        for(int i=0; i<word.length;i++){
            StringBuilder temp = new StringBuilder(word[i]);
            ans.append(temp.reverse());
            if(i!=word.length -1){ // it means if the word is not last then 
                ans.append(" "); 
            }
        }
        return ans.toString();
    }
}

// so firstly split words and put it in an string array then for each word perform reverse using string builder properties the append the words if the word is not last then only add on string builder otherwise we can findout that this word is of last index 