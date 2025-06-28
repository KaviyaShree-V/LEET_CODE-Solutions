/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        //deleting node is given we need to take its value and reassign by next node's value
        node.val = node.next.val;
        //link the next node with next other node to remove the given node from a LL
        node.next = node.next.next;
    }
}