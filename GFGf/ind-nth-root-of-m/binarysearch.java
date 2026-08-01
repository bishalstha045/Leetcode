class Solution {
    public int nthRoot(int n, int m) {
      int l=0;
      int r=m;
      while(l<=r){
          int mid=l+(r-l)/2;
          if(Math.pow(mid,n)==m)return mid;
          else if(Math.pow(mid,n)>m)r=mid-1;
          else l=mid+1;
      }
      return -1;
    }
}
// Binary Search Approach
// Search for the nth root in the range [0, m].
// Calculate mid and compare mid^n with m.
// If equal, return mid.
// If mid^n is greater than m, search the left half.
// Otherwise, search the right half.
// Return -1 if no integer nth root exists.
