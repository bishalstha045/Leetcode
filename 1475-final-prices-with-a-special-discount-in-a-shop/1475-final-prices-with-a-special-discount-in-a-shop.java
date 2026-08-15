class Solution {
    public int[] finalPrices(int[] prices) {
        int[]ans=new int[prices.length];
        Stack<Integer> st=new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!st.isEmpty() && prices[st.peek()]>prices[i]){
                st.pop();
            }
            if(st.isEmpty())ans[i]=prices[i];
            else ans[i]=prices[i]-prices[st.peek()];
            st.push(i);
        }
        return ans;
    }
}
// Traverse from right to left and use a monotonic stack to find the first
// smaller or equal price on the right. Remove all prices greater than the
// current price because they cannot be used as a discount. If the stack is
// empty, there is no discount; otherwise, subtract the price at the top.
// Time: O(n), Space: O(n)