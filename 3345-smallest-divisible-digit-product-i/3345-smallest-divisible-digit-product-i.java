class Solution {
    public int smallestNumber(int n, int t) {
       for(int i=n;i<=100;i++){
        if(product(i)%t==0)return i;
       }
       return -1;
    }
    public int product(int n){
        int ans=1;
        while(n!=0){
            int r=n%10;
            ans*=r;
            n/=10;
        }
    
    return ans;
}
}
// Brute Force Approach:
// Check every number starting from n.
// Find the product of its digits.
// If the product is divisible by t, return that number.
// Otherwise, continue checking until the limit.