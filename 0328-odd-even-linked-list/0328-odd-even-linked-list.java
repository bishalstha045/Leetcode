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
    public ListNode oddEvenList(ListNode head) {
        // Edge case: if list is empty or has only one node
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        // Attach even list after odd list
        odd.next = evenHead;
        return head;
    }
}
/*
I separated the linked list into odd and even positioned nodes using two pointers.
After linking all odd nodes together and all even nodes together,
I attached the even list after the odd list.
This solution runs in O(n) time and uses O(1) extra space.
*/