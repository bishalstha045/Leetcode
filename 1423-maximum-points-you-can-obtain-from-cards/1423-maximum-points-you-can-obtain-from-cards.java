class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int max=lsum;
        for(int i=0;i<k;i++){
            lsum-=cardPoints[k-1-i];
            rsum+=cardPoints[n-1-i];
            max=Math.max(max, lsum+rsum);
        }
        return max;
    }
}
// Approach:
// 1. First, take all k cards from the left and calculate their sum.
// 2. Store this as the initial maximum score.
// 3. Now, replace one left card with one right card in each iteration.
// 4. Remove the last selected left card and add the next right card.
// 5. After every replacement, update the maximum score.
// 6. Continue until all possible left-right combinations of k cards are checked.
//
// Time Complexity: O(k)
// Space Complexity: O(1)