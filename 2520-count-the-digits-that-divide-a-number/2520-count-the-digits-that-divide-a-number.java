class Solution {
    public int countDigits(int num) {
        int  count=0;
        int copynum=num;
        while(copynum!=0)
        {
            int r = copynum%10;
            if( r!=0 && num % r ==0 ){
                count++;
            }
            copynum/=10;
        }
        return count;
    }
}