
class RecentCounter {
    ArrayDeque<Integer> q;
    public RecentCounter() {
        q = new ArrayDeque<>();
    }
    public int ping(int t) {
        // ENQUEUE → add current call
        q.addLast(t);
        // Remove calls outside the last 3000 ms
        while (q.peekFirst() < t - 3000) {
            // DEQUEUE → remove oldest call
            q.removeFirst();
        }
        // Number of recent calls
        return q.size();
    }
}