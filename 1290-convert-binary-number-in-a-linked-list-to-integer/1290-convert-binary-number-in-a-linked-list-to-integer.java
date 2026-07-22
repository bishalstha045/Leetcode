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
     int ans=0;
     while(head!=null){
        ans=2*ans + head.val;
        head=head.next;
     }
     return ans;
    }
}
/*
We don't need to store the binary number separately.
Instead, we build the decimal value while traversing the linked list.
For every node:
1. Multiply the current answer by 2 because, in binary,
   adding a new digit shifts all previous bits one position to the left.
2. Add the current node's value (0 or 1).
 */

// class Solution {
//     public int getDecimalValue(ListNode head) {
//       StringBuilder sb = new StringBuilder();
//         while(head != null){
//             sb.append(head.val);
//             head = head.next;
//         }
//         int ans = 0;
//         int power = 0;
//         for(int i = sb.length()-1; i >= 0; i--){
//             if(sb.charAt(i) == '1'){
//                 ans += Math.pow(2, power);
//             }
//             power++;
//         }
//         return ans;
//     }
// }
/*
Store all binary digits in a StringBuilder.
Traverse the string from right to left and convert it to decimal
using Math.pow(2, power).
Time: O(n)
Space: O(n)
*/