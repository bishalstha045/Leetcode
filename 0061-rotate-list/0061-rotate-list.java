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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        // Find length and tail
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        k = k % length;
        if (k == 0)
            return head;
        // Make circular
        tail.next = head;
        // Find new tail
        int steps = length - k - 1;
        ListNode newTail = head;
        while (steps-- > 0)
            newTail = newTail.next;
        // New head
        ListNode newHead = newTail.next;
        // Break the circle
        newTail.next = null;
        return newHead;
    }
}
/*
Find the length of the list and reduce k using k % length since rotating by the
list length results in the same list. Connect the tail to the head to form a
circular linked list, move to the new tail at (length - k - 1), set the next
node as the new head, and break the circle. This solves the problem in O(n)
time and O(1) extra space.
*/