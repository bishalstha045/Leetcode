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
    public ListNode partition(ListNode head, int x) {
       ListNode bigdummy=new ListNode(0); 
       ListNode smalldummy=new ListNode(0);
       ListNode big=bigdummy;
       ListNode small=smalldummy;
       ListNode curr=head;
       while(curr!=null){
        ListNode next=curr.next;
        curr.next=null;
        if(curr.val<x){
            small.next=curr;
            small=small.next;
        }
        else{
            big.next=curr;
            big=big.next;
        }
        curr=next;
       } 
       small.next=bigdummy.next;
       return smalldummy.next;
    }
}
/*
Intuition:
The goal is to keep all nodes with values smaller than x before nodes with
values greater than or equal to x while preserving their original order.
Approach:
- Create two separate linked lists using dummy nodes:
  one for values < x and another for values >= x.
- Traverse the original list once and append each node to its respective list.
- Connect the end of the smaller list to the beginning of the larger list.
- Return smallDummy.next since the dummy node is only a placeholder.
remember this smallDummy and bigDummy are the respected heads of their list 

Time Complexity: O(n)
Space Complexity: O(1)
*/