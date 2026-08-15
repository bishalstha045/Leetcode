class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[]ans=new int[temperatures.length];
       Stack<Integer> st= new Stack<>();
       for(int i=temperatures.length-1;i>=0;i--){
        while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
            st.pop();
        }
        if(st.isEmpty())ans[i]=0;
        else ans[i]=st.peek()-i;
        st.push(i);
       } 
       return ans;
    }
}
// I traverse from right to left because I need to find
// the next warmer temperature on the right side.
// The stack stores indices of useful temperatures.
// If the temperature at the top is smaller or equal to
// the current temperature, I remove it because it cannot
// be the next warmer day for the current element.
// After removing them, if the stack is empty, there is
// no warmer day, so the answer is 0.
// Otherwise, the top of the stack gives the index of the
// next warmer day, so I calculate st.peek() - i.
// Finally, I push the current index into the stack.
// Time: O(n) because every index is pushed and popped once.
// Space: O(n) for the stack.


// class Solution {
//     public int[] dailyTemperatures(int[] temperatures) {
//         int[]ans=new int[temperatures.length];
//         for(int i=0;i<temperatures.length;i++){
//             for(int j=i+1;j<temperatures.length;j++){
//                 if(temperatures[j]>temperatures[i]){
//                     ans[i]=j-i;
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }
//this will not get executed instead it will so time limit exceeded because of its time complexity
