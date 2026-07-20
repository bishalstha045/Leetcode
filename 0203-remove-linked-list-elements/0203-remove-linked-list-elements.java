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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}
/*
Created a dummy node to simplify deletion, especially when the head node itself needs to be removed. Used `prev` to track the previous valid node and `curr` to traverse the list. If `curr.val` matches the target value, skipped it by connecting `prev.next` to `curr.next`; otherwise, moved `prev` forward. Finally, returned `dummy.next` as the updated head. Time: O(n), Space: O(1).
*/