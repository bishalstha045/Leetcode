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
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow ==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow; // return fast
            }
        }
        return null;
    }
}
/*
Approach:
I used Floyd's Cycle Detection Algorithm (Tortoise and Hare). First, I move
the slow pointer one step and the fast pointer two steps until they meet,
which confirms that a cycle exists. After that, I reset the slow pointer
to the head of the linked list and move both slow and fast one step at a
time. The node where they meet again is the starting node of the cycle.
If no cycle is found, I return null.
Time Complexity: O(n)
Space Complexity: O(1)
*/


// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         HashSet<ListNode> visited = new HashSet<>();
//         ListNode current = head;
//         while (current != null) {
//             if (visited.contains(current)) {
//                 return current;   // Start of the cycle
//             }
//             visited.add(current);
//             current = current.next;
//         }
//         return null;   // No cycle
//     }
// }
/*
Approach:
I used a HashSet to keep track of all visited nodes. While traversing the
linked list, I check whether the current node has already been visited.
If it has, that node is the starting point of the cycle, so I return it.
If I reach null, it means there is no cycle, so I return null.
Time Complexity: O(n)
Space Complexity: O(n)
*/