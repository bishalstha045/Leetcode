class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if (k > q.size()) {
            return q;
        }
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.offer(s.pop());
        }
        int remaining = q.size() - k;
        for (int i = 0; i < remaining; i++) {
            q.offer(q.poll());
        }
        return q;
    }
}
// if k is greater than queue size, return same queue
// take first k elements and put them in stack
// stack reverses the order of elements
// put stack elements back into queue
// find remaining elements and move them to the back
// this keeps the remaining elements in same order
