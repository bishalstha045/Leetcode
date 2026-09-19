class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        for(int i=0;i<=n;i++){
            int num=i;
            int count=0;
            while(num!=0){
                num=num &(num-1);
                count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}
/*
* Create an answer array for numbers `0` to `n`.
* For each number, count its set bits using `num & (num - 1)`.
* This operation removes the rightmost `1` bit.
* Store the count in `ans[i]` and return the array.
* Time: `O(n log n)`, Space: `O(n)`.
*/