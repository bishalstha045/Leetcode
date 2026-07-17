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
    public ListNode reverseList(ListNode head) {
      ListNode temp=head;
      ListNode prev=null;
      while(temp!=null){
        ListNode next=temp.next; // Save next node
        temp.next=prev;// Reverse link
        prev=temp;// Move prev forward
        temp=next;// Move curr forward
      }
      return prev;
    }
}
/*
Approach:
- Use three pointers: prev, curr, and next. (curr means temp)
- Traverse the list while storing the next node before changing any links.
- Reverse the current node's next pointer to point to the previous node.
- Move all pointers one step forward and continue until the end of the list.
- At the end, prev points to the new head of the reversed linked list.
Time Complexity: O(n)
Space Complexity: O(1)
*/



// class Solution {
//     public ListNode reverseList(ListNode head) {
//         Stack<Integer> s= new Stack<>();
//         ListNode temp=head;
//         //firstly store data in stacks
//         while(temp!=null){
//             s.push(temp.val);
//             temp=temp.next;
//         }
//         //now put values back in reverse order
//         temp=head;
//         while(temp!=null){
//             temp.val=s.peek();
//             s.pop();
//             temp=temp.next;
//         }
//         return head;
//     }
// }
/*
Approach:
- Traverse the linked list and push each node's value into a stack.
- Traverse the list again and replace each node's value with the top value from the stack.
- Since a stack follows LIFO (Last In, First Out), the values are assigned in reverse order.
- This reverses only the node values, not the actual links between the nodes.
Time Complexity: O(n)
Space Complexity: O(n)
*/