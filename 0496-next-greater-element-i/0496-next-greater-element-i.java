class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[]ans=new int[nums1.length];
       Stack<Integer>st=new Stack<>();
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=nums2.length-1;i>=0;i--){
        while(!st.isEmpty()&& nums2[i]>=st.peek()){
            st.pop();
        }
        if(st.isEmpty())map.put(nums2[i],-1);
        else map.put(nums2[i],st.peek());
        st.push(nums2[i]);
       }
       for(int i=0;i<nums1.length;i++){
        ans[i]=map.get(nums1[i]);
       }
       return ans;
    }
}
/*
I used a monotonic decreasing stack to find the next greater element for each element in nums2. I traverse nums2 from right to left and remove all smaller or equal elements from the stack because they cannot be the next greater element. If the stack is empty, I store -1 in the HashMap, otherwise I store the top of the stack as the next greater element. The HashMap stores each element of nums2 along with its next greater element. Finally, I traverse nums1 and use map.get() to get the answer for each element. This solution takes O(n + m) time and O(n) extra space.
 */