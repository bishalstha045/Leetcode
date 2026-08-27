class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time += Math.min(tickets[i], tickets[k] - 1);
            }
        }
        return time;
    }
}

/*
Approach:
Instead of simulating the queue, we calculate how many
tickets each person can buy before person k finishes.
people i <= k:
They can buy at most tickets[k] tickets.
For people i > k:
They can buy at most tickets[k] - 1 tickets.
Add all these ticket purchases to get the total time.
Time Complexity: O(n)
Space Complexity: O(1)
*/