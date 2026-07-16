/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
}
// Floyd's Cycle Detection (Tortoise and Hare Algorithm)
// Initialize two pointers, slow and fast, at the head of the linked list.
// Move slow by one step and fast by two steps in each iteration.
// If the linked list contains a cycle, both pointers will eventually meet.
// If fast reaches null or fast.next becomes null, the list has no cycle.