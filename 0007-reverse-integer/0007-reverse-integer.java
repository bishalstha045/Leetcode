class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            if(rev>Integer.MAX_VALUE/10 || rev< Integer.MIN_VALUE/10){//this to check overflow condition
                    return 0;
            }
            rev*=10;
            rev+=x%10;
            x/=10;
        }
       return rev;
    }
}