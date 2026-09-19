class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n!=0){
            n=n & (n-1);
            c++;
        }
        return c;
    }
}
/*
1. Start count = 0.
2. n & (n - 1) removes the rightmost 1.
3. Every time we remove a 1, increase count.
4. When n becomes 0, all 1s are removed.
5. Return count.
*/