/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null)
            return head;
        ListNode prev = head;
        ListNode next = head.next;
        head.next = null;
        ListNode temp;
        while(next != null)
        {
            temp = next.next;
            next.next = prev;
            prev = next;
            next = temp;
​
        }
        return prev;
    }
}
