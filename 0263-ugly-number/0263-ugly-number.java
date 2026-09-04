class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        int[]factors={2,3,5};
        for(int el:factors){
            while(n%el==0){
                n/=el;
            }
        }
        return n==1;
    }
}
/*
Approach:
If n <= 0, it cannot be an ugly number.
Ugly numbers contain only 2, 3, and 5 as prime factors.
Remove all factors of 2, 3, and 5 from n.
If n becomes 1, it is an ugly number.
Otherwise, it contains another prime factor, so return false.
Time Complexity: O(log n)
Space Complexity: O(1)
*/