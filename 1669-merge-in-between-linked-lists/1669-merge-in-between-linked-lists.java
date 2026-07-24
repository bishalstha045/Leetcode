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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA=list1;
        for(int i=0;i<a-1;i++){
            prevA=prevA.next;
        }
        ListNode ab=prevA;
        for(int i=a;i<=b;i++){
            ab=ab.next;
        }
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        prevA.next=list2;
        temp.next=ab.next;
        return list1;
    }
}
/*
Approach:
First, find the node just before index `a` in `list1` (prevA). Then move another pointer
to the node at index `b` so we know where the removed section ends. Traverse `list2`
to find its last node. Connect `prevA` to the head of `list2`, and finally connect the
last node of `list2` to the node after index `b`. This removes the nodes from `a` to `b`
and inserts `list2` in their place.
Time Complexity: O(n + m)
n = length of list1
m = length of list2
Space Complexity: O(1)
Only a few pointers are used.
*/