class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev_num=0;
        int n=x;
        while(n!=0){
            rev_num*=10;
            rev_num+=(n%10);
            n/=10;
        }
        if(rev_num==x){
            return true;
        }
        else{
            return false;
        }
    }
}