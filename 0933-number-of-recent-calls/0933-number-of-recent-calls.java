class RecentCounter {
    Queue<Integer> q;
    public RecentCounter() {
        q = new ArrayDeque<>();
    }
    public int ping(int t) {
        // ENQUEUE current call
        q.offer(t);
        // DEQUEUE calls that are too old
        while(q.peek() < t - 3000) {
            q.poll();
        }
        // Count recent calls
        return q.size();
    }
}