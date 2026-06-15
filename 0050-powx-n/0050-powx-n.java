import java.util.*;
class Solution {
    public double myPow(double x, int n) {
        long N =n;    // handel Integer.MIN_VALUE error
        if(N<0){
            x=1/x;
            N=-N;
        }
        double ans=1;
        while(N>0){
            if(N%2==1){
                ans *=x;
            }
            x*=x;
            N/=2;
        }
        return ans;
    }
}
/*
We store n in a long variable N to avoid integer overflow.
For example, Integer.MIN_VALUE = -2147483648.
If we try to do -n directly, it overflows because 2147483648
cannot fit inside an int.
If the power is negative:
x^(-n) = 1 / (x^n)
So we convert:
x = 1 / x
N = -N
Now we only need to deal with a positive exponent.

We use Binary Exponentiation (Fast Power) instead of
multiplying x by itself N times.

The idea is:
- If N is odd, the current value of x contributes to the answer,
  so we do ans *= x.
- Then we square x (x *= x) to generate the next power.
- We divide N by 2 to process the next binary bit.
Example:
2^10
10 -> 5 -> 2 -> 1 -> 0
x values:
2 -> 4 -> 16 -> 256
Only when N is odd do we multiply x into ans.
This reduces the time complexity from O(N) to O(log N).
*/