/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //1 2 3 4 
            
        boolean set = true;
        if(head == null || head.next == null || n == m)
        {
            return head;
        }
        int count = 1;
        ListNode prev = null;
​
        ListNode prev1 = head;
​
        ListNode cur = head;
        while(count < m)
        {
            prev1 = cur;
            cur = cur.next;
            count++;
        }
        int iteration = n - m;
        ListNode head1 = cur;
        if(prev1 == cur)
            set = false;
        prev = cur;
        cur = cur.next;
        ListNode temp = cur;
        while(iteration > 0 && cur != null)
        {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
            iteration--;
        }
​
