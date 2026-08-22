class MinStack {
    Stack<Integer> normalStack;
    Stack<Integer> minStack;
    public MinStack() {
        normalStack=new Stack<>();
        minStack=new Stack<>();
    }
    
    public void push(int value) {
        normalStack.push(value);
        if( minStack.isEmpty()||minStack.peek()>=value)minStack.push(value);
    }
    
    public void pop() {
        int val=normalStack.pop();
        if( !minStack.isEmpty()&&val==minStack.peek()){
            minStack.pop();
        }
    }
    
    public int top() {
        return normalStack.peek();
    }
    
    public int getMin() {
       return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

 /*
 
 /*
Use two stacks:
normalStack → stores all elements.
minStack → stores the minimum values.
On push, update minStack if the value
is <= the current minimum.
On pop, remove from minStack if the
removed value was the current minimum.
top() and getMin() use peek().
TC: O(1) for all operations.
SC: O(n).
*/
