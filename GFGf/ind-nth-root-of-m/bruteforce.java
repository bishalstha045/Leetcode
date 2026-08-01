class Solution {
    public int nthRoot(int n, int m) {
        if(m==0)return 0;
        for(int i=1;i<=m;i++){
            if(Math.pow(i,n)==m)return i;
            else if(Math.pow(i,n)>m)break;
        }
        return -1;
    }
}
// Brute Force Approach
// Check every possible number from 1 to m.
// If i^n equals m, then i is the nth root.
// If i^n becomes greater than m, stop searching because further values will only be larger.
// If no integer nth root is found, return -1.
