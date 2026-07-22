/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
      StringBuilder sb = new StringBuilder();
        while(head != null){
            sb.append(head.val);
            head = head.next;
        }
        int ans = 0;
        int power = 0;
        for(int i = sb.length()-1; i >= 0; i--){
            if(sb.charAt(i) == '1'){
                ans += Math.pow(2, power);
            }
            power++;
        }
        return ans;
    }
}
/*
Store all binary digits in a StringBuilder.
Traverse the string from right to left and convert it to decimal
using Math.pow(2, power).
Time: O(n)
Space: O(n)
*/