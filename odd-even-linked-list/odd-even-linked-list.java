/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
        {
            return head;
        }
        ListNode cur2 = head.next;
        ListNode even = cur2;
        
        ListNode cur1 = head;
        while(cur2 != null && cur2.next != null)
        {
            ListNode temp = cur2.next;
            ListNode temp1 = temp.next;
            cur1.next = temp;
            cur2.next = temp1;
            cur1 = temp;
            cur2 = temp1;
        }
         
        cur1.next = even;
        
        return head;
        
    }
}
