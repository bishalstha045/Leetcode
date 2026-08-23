class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int n1=st.pop();
                int n2=st.pop();
                int result=n1+n2;
                st.push(result);
            }
            else if(tokens[i].equals("-")){
                int n1=st.pop();
                int n2=st.pop();
                int result=n2-n1;
                st.push(result);
            }
            else if(tokens[i].equals("*")){
                int n1=st.pop();
                int n2=st.pop();
                int result=n2*n1;
                st.push(result);
            }
            else if(tokens[i].equals("/")){
                int n1=st.pop();
                int n2=st.pop();
                int result=n2/n1;
                st.push(result);
            }
            else st.push(Integer.parseInt(tokens[i]));
        }
        return st.peek();
    }
}
// I use a stack to evaluate the Reverse Polish Notation.
// If the token is a number, I simply push it into the stack.
// If it is an operator, I pop the top two numbers and perform
// the operation. For - and /, the order is important because
// the first popped number is the right operand.
// After every operation, I push the result back into the stack.
// At the end, the stack contains only the final answer.