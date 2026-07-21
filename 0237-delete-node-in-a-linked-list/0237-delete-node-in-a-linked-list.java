/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
// Since the previous node is not available, we cannot delete the current node directly.
// Instead, copy the value of the next node into the current node and bypass the next node.
// This effectively removes the target node from the linked list in O(1) time.