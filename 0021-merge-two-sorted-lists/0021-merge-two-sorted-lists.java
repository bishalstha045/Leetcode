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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy= new ListNode(45);
        ListNode curr=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        if(list1!=null)curr.next=list1;
        if(list2!=null)curr.next=list2;
        return dummy.next;
    }
}
// I used a dummy node to avoid handling the first node of the merged list separately.
// A `curr` pointer keeps track of the last node in the merged list. At each step, I
// compare the current nodes of both lists, attach the smaller one to `curr`, and move
// both `curr` and the corresponding list pointer forward. After one list becomes null,
// I directly connect the remaining nodes of the other list since they are already
// sorted and linked. Finally, I return `dummy.next`, which points to the head of the
// merged sorted list.