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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy=new ListNode(0);
        ListNode curr=head.next;//skip first zero
        ListNode temp=dummy;
        int sum=0;
        while(curr!=null){
            if(curr.val==0){
                temp.next=new ListNode(sum);
                temp=temp.next;
                sum=0;
            }
            else sum+=curr.val;
            curr=curr.next;
        }
        return dummy.next;
    }
}
/*
  Traverse the linked list while accumulating the values between consecutive zero nodes.
  Whenever a zero node is reached, create a new node containing the accumulated sum,
  attach it to the result list, and reset the sum for the next segment. This solution
  processes the list in a single traversal, resulting in O(n) time complexity and
  O(1) extra space (excluding the output list).
 */