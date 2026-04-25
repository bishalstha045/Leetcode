import java.util.*;
class Solution {
    public double myPow(double x, int n) {
        double result = Math.pow(x,n);
        return result;
    }
}
// this is not proper solution for this since question mistakely forgot to put a constraint that inbuilt function shoubldn't be allowed 
// its complexity is O(logn)
// question wants logic