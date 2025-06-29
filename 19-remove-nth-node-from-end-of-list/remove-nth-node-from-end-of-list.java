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
class Solution 
{
    public ListNode removeNthFromEnd(ListNode head, int n) 
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

        if(count < n)
        return null;
        if(count == n)
        return head.next;
        
        int delete = count - n, pointer = 0;
        temp = head;
        while(temp != null)
        {
            if((pointer + 1) == delete)
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