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
    public ListNode swapNodes(ListNode head, int k) 
    {
        if(head == null)
        return head;
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        if(count < k)
        return head;
        ListNode s1 = null, s2 = null;
        if(count == k)
        {
            
        }
        temp = head;
        s1 = null;
        s2 = null;
        int reverseCount = count-k, p1=0;
        int swap1 = 0, swap2 = 0;
        while(temp != null )
        {
            if((p1+1) == k)
            {
                s1 = temp;
            }
            if(p1 == reverseCount)
            {
                s2 = temp;
            }
            temp = temp.next;
            p1++;
        }
        if (s1 != null && s2 != null) 
        {
            int tempVal = s1.val;
            s1.val = s2.val;
            s2.val = tempVal;
        }
        return head;
    }
}