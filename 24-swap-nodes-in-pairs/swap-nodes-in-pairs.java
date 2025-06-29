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
    public ListNode swapPairs(ListNode head) 
    {
        if(head == null || head.next == null)
        return head;
        ListNode temp = head;
        while(temp != null && temp.next != null)
        {
            int pointer1 = temp.val;
            int pointer2 = temp.next.val;
            int add = pointer2;
            temp.next.val = pointer1;
            temp.val = add;
            temp = temp.next.next;
        }
        return head;
    }
}