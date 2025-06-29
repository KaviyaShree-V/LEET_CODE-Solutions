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
    public ListNode deleteMiddle(ListNode head) 
    {
        if(head == null || head.next == null)
        return null;
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        temp = head;
        int pointer = 0, div = count/2;
        while(temp != null)
        {
            if((pointer+1) == div)
            {
                temp.next = temp.next.next;
                return head;
            }
            pointer++;
            temp = temp.next;
        }
        return head;
    }
}