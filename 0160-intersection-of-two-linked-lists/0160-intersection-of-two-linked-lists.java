/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode p1=headA;
       ListNode p2=headB;
       while(p1!=p2){
        p1=(p1==null)?headB:p1.next;
        p2=(p2==null)?headA:p2.next;
       }
       return p1; // or p2
    }
}
// Two-pointer approach.
// Traverse both lists; when a pointer reaches the end, redirect it to the other list's head.
// Both pointers travel equal distance (m + n),so they meet at the intersection or both become null.


// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         HashSet<ListNode> ans = new HashSet<>();
//         while(headA!=null){
//             ans.add(headA);
//             headA=headA.next;
//         }
//         while(headB!=null){
//             if(ans.contains(headB))return headB;
//             headB=headB.next;
//         }
//         return null;
//     }
// }
/*
Basically, i have used a hashset which will store listnode for list1 
and i traverse through list2 and check if the particular item is present in the hashset
if yes then return that node other wise keep checking
if no intersection found then return null
 */