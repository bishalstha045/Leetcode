class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0)&&(n &(n-1))==0;
    }
}

/*
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n%2==0){
            n/=2;
            if(n==1){
                return true;            }
        }
    return false;
    }
}
 */