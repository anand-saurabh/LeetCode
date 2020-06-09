//83. Remove Duplicates from Sorted List
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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        int count = 0;
        while(cur != null)
        {
            
            if(cur.val == prev.val)
            {
                count++;
            }
            else
            {
                if(count > 0)
                {
                    prev.next = cur;
                    count = 0;
                }
                prev = cur;
            }
            cur = cur.next;   
        }
        if(count > 0)
        {
            prev.next = cur;
        }
        return head;
    }
}