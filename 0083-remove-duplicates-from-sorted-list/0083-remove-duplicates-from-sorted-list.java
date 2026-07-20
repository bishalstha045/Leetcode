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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){ //we are considering next so,
            if(temp.val==temp.next.val){ //if current node and next node equal then current will skip next and then points to that skips next
                temp.next=temp.next.next;
            }
            else temp=temp.next;
        }
        return head;
    }
}
// Since the linked list is sorted, duplicates always appear next to each other. I traverse the list using one pointer and compare the current node with the next node. If both values are the same, I remove the duplicate by updating the next pointer; otherwise, I move to the next node. This removes all duplicates in one pass with O(n) time and O(1) extra space.