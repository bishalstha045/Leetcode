class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int el:asteroids){
            boolean isAlive=true;
            while( isAlive && !st.isEmpty() && st.peek()>0 && el<0){
                if(st.peek()<Math.abs(el)){
                    st.pop();
                }
                else if(st.peek()==Math.abs(el)){
                    st.pop();
                    isAlive=false;
                }
                else{
                    isAlive=false;
                }
            }
            if(isAlive)st.push(el);
        }
        int[]res=new int[st.size()];
        for(int i=0;i<res.length;i++){
            res[i]=st.get(i);
        }
        return res;
    }
}
// I used a stack to keep track of the asteroids that are still alive.
// A collision can happen only when the top of the stack is positive
// and the current asteroid is negative.
// If the top asteroid is smaller, I remove it and continue the loop
// because the current asteroid can collide with the next asteroid too.
// If both have the same size, both are destroyed.
// If the top asteroid is bigger, the current asteroid is destroyed.
// If the current asteroid is still alive, I push it into the stack.
// At the end, I convert the stack into an array.
// Time Complexity: O(n)
// Space Complexity: O(n)