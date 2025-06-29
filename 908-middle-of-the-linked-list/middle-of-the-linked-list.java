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
    public ListNode middleNode(ListNode head) 
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
        int div = count/2;
        temp = head;
        int pointer = 0;
        while(temp != null)
        {
            if((pointer+1) == div)
            {
                temp = temp.next;
                return temp;
            }
            pointer++;
            temp = temp.next;
        }
        return head;
    }
}