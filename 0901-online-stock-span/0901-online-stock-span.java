class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    public int next(int price) {
        int span = 1;
        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }
        st.push(new int[]{price, span});
        return span;
    }
}
// I used a monotonic decreasing stack to solve this problem. For every new price
// I remove all the previous prices that are smaller than or equal to the current price because they cannot be the previous greater element anymore. 
// Instead of storing only the price, I store the price along with its span
//  so when I pop an element I can directly add its already calculated span. 
//  This avoids checking every previous day again and gives an O(n) 
//  amortized time complexity.

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */