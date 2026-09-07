class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();
        // Put senator indices into their respective queues
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();
            if (r < d) {
                // Radiant acts first and bans Dire
                radiant.offer(r + n);
            } else {
                // Dire acts first and bans Radiant
                dire.offer(d + n);
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}
// Store R and D positions in two queues.
// The senator with the smaller position acts first and bans the other.
// Move the winning senator to the next round using index + n.
// Continue until one party's queue becomes empty.
