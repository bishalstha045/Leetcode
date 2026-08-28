class MyQueue {
    Stack<Integer> st;
    public MyQueue() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty())st.push(x);
        else{
            int prev=st.pop();
            push(x);
            st.push(prev);
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}
/*
I used one stack and recursion to make it work like a queue. If the stack is empty, I directly push the element. Otherwise, I remove the top element, recursively push the new element until the stack becomes empty, and then add the removed elements back. This keeps the first inserted element at the top, so `pop()` follows FIFO order.
*/

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */