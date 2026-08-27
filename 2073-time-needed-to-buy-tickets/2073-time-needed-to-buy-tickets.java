class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new ArrayDeque<>();
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        int time=0;
        while(!q.isEmpty()){
            int i=q.poll();
            tickets[i]--;
            time++;
            if(tickets[i]>0){
                q.offer(i);
            }
            else if(i==k && tickets[i]==0){
                return time;
            }
        }
        return -1; 
    }
}
/*

I use a queue to store each person's index and simulate buying tickets one by one. Each person buys one ticket and goes back to the queue if they still have tickets left. When person k buys their last ticket, we return the total time taken.
 */



// class Solution {
//     public int timeRequiredToBuy(int[] tickets, int k) {
//         int time = 0;
//         for (int i = 0; i < tickets.length; i++) {
//             if (i <= k) {
//                 time += Math.min(tickets[i], tickets[k]);
//             } else {
//                 time += Math.min(tickets[i], tickets[k] - 1);
//             }
//         }
//         return time;
//     }
// }

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