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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // Move prev to node before left
        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        // Reverse nodes between left and right
        ListNode previous = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        // Reconnect
        prev.next.next = curr;
        prev.next = previous;
        return dummy.next;
    }
}
// Create a dummy node to handle the edge case when left = 1. Move prev to the node just before the reversal starts (left - 1). Set curr as the first node to be reversed and use previous to reverse exactly (right - left + 1) nodes, while next temporarily stores the upcoming node so the remaining list isn't lost. After the loop, previous points to the new head of the reversed sublist, curr points to the first node after the reversed part (right + 1), and prev.next still points to the original left node, which has now become the tail. Finally, reconnect the list by linking the tail to curr (prev.next.next = curr) and linking the left part to the new head (prev.next = previous), then return dummy.next.