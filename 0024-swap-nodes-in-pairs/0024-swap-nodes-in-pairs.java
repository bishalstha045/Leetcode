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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;
        while (first != null && second != null) {
            ListNode third = second.next;
            //link updation
            second.next = first;
            first.next = third;
            if (prev == null)
                head = second;
            else
                prev.next = second;
            // Pointer updation
            prev = first;
            first = third;
            if (third != null)
                second = third.next;
            else
                second = null;
        }
        return head;
    }
}
/*
I solved this problem iteratively without using a dummy node. I maintained four pointers (prev, first, second, and third) to swap each adjacent pair by updating their links. After each swap, I connected the previous swapped pair to the current one and moved the pointers to the next pair. The list is traversed only once, giving O(n) time complexity with O(1) extra space.
*/