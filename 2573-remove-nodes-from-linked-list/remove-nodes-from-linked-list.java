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
    // public ListNode removeNodes(ListNode head) 
    // {
    //     if(head == null)
    //     return head;
    //     head = reverse(head);
    //     ListNode temp = head;
    //     // int data = temp.data;
    //     while(temp != null && temp.next != null)
    //     {
    //         if(temp.val > temp.next.val)
    //         {
    //             temp.next = temp.next.next;
    //         }
    //         else
    //         {
    //             temp = temp.next;
    //         }
    //     }
    //     return reverse(head);
    // }
        public ListNode removeNodes(ListNode head) 
        {
        if (head == null) 
        return null;
        head = reverse(head);
        ListNode temp = head;
        while (temp != null && temp.next != null) 
        {
            if (temp.val > temp.next.val) 
            {
                temp.next = temp.next.next;
            } 
            else 
            {
                temp = temp.next;
            }
        }
        return reverse(head);
    }

    private ListNode reverse(ListNode head) 
    {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) 
        {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}