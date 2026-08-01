class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int el:piles){
            right=Math.max(el,right);
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            long totalhour=0;
            for(int pile:piles){
                totalhour+=Math.ceil((double)pile/mid);
            }
            if(totalhour<=h){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
}
// Binary Search on the possible eating speed instead of searching the array.
// For every guessed speed, calculate the total hours needed to finish all piles.
// If Koko can finish within h hours, save the speed and try a smaller one.
// Otherwise, increase the speed since the current one is too slow.
// Finally, return the minimum valid eating speed found.