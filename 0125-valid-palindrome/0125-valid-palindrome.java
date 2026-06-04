class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sc= new StringBuilder();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            //1 step is to convert uppercase to lowercase considering ascii value for A= 65 and a=97
            if(ch>='A' && ch<='Z'){
                ch = (char)(ch + 32);
            }
            // 2nd step is to remove space and special characters
            if((ch>='a' && ch<='z') || (ch>='0' && ch<='9')){
                sc.append(ch); 
            }
        }
            int i=0;
            int j=sc.length()-1;
            while(i<=j){
                if(sc.charAt(i)!=sc.charAt(j)) return false;
                i++;
                j--;
            }
            return true;
    }
}
// firstly you have to convert upper into lower case then you have to simple remove special character like , and other and space too then finally check palindrome or not using two pointer strategy for that we have use two pointers i and j