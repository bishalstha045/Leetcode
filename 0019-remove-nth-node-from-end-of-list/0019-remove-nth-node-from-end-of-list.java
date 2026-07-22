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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // Move both pointers until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Remove the nth node from the end
        slow.next = slow.next.next;
        return dummy.next;
    }
}
/*
I solved this problem using the two-pointer approach with a dummy node.
First, I moved the fast pointer n steps ahead so that the gap between
the slow and fast pointers became n nodes. Then I moved both pointers
together until the fast pointer reached the last node. At that point,
the slow pointer was just before the node that needed to be deleted.
Finally, I skipped that node by updating slow.next. I used a dummy node
to handle edge cases easily, such as when the first node of the linked
list needs to be removed.
*/
