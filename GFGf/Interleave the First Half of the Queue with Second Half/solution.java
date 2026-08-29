class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        Queue<Integer> a=new ArrayDeque<>();
        int half=q.size()/2;
        for(int i=0;i<half;i++){
            a.offer(q.poll());
        }
        while(!a.isEmpty()){
            q.offer(a.poll());
            q.offer(q.poll());
        }
    }
}
// Take first half into another queue
// Interleave first half and second half
// by taking one element from each alternately
